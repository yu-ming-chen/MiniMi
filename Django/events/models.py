from django.db import models
from django.utils import timezone

# Create your models here.

class Event(models.Model):
    user = models.CharField(max_length=100)
    event_type = models.CharField(max_length=100)
    detail = models.CharField(max_length=1000)
    is_active = models.BooleanField(default=True)
    datetime_created = models.DateTimeField(default=timezone.now)
