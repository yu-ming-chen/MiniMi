from django.contrib import admin
from django.urls import path, include
from django.conf.urls import url

from . import views

app_name = 'events'
urlpatterns = [
    url(r'^api/events/(?P<pk>[0-9]+)$', views.EventView.as_view()),
    url(r'^api/events/$', views.EventView.as_view()), 
]