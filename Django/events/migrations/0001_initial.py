# Generated by Django 2.2.7 on 2020-03-20 04:05

from django.db import migrations, models
import django.utils.timezone


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Event',
            fields=[
                ('id', models.AutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('user', models.CharField(max_length=100)),
                ('event_type', models.CharField(max_length=100)),
                ('detail', models.CharField(max_length=1000)),
                ('is_active', models.BooleanField(default=True)),
                ('datetime_created', models.DateTimeField(default=django.utils.timezone.now)),
            ],
        ),
    ]