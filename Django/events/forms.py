from django import forms
from .models import Event

class EventForm(forms.ModelForm):

    class Meta:
        model = Event
        fields = ('user', 'event_type', 'detail')