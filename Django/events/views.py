from django.shortcuts import render
from django.utils import timezone
from .models import Event
from .serializers import EventSerializer
from .forms import EventForm

from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework.decorators import api_view
from rest_framework import status, authentication, permissions

import json
# Create your views here.

class EventView(APIView):

    serializer = EventSerializer

    def get(self, request, pk=None):
        try:
            if pk != None:
                event = Event.objects.get(pk=pk)
                body = self.serializer_to_body(
                    self.serializer, event, "event"
                    )

            else:
                events = Event.objects.all().order_by('-datetime_created')[:10]
                body = {"data": EventSerializer(events, many=True).data}
            return Response(body, status=status.HTTP_200_OK)
        except Event.DoesNotExist:
            return Response(status=status.HTTP_400_BAD_REQUEST)

    def post(self, request):
        data = self.post_request_parser(request)
        form = EventForm(data)
        if form.is_valid():
            event = form.save()
            body = self.serializer_to_body(
                self.serializer, event, "event"
                )
            return Response(body, status=status.HTTP_200_OK)
        else:
            return Response(form.errors, status=status.HTTP_400_BAD_REQUEST)

    def serializer_to_body(self, serializer, obj, obj_name):
        data = dict()
        data[obj_name] = serializer(obj).data
        return {'data': data}

    def post_request_parser(self, request):
        """
        converts POST requests into appropriate form data:
        json -> form
        form -> form
        """
        if request.META["CONTENT_TYPE"] == "application/json":
            data = self.jsonForm(request)
        else:
            data = request.POST
        return data

    def jsonForm(self, request):
        return json.loads(request.body.decode('utf-8'))