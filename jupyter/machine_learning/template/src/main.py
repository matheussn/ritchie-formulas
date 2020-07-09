#!/usr/bin/python3
import os

from template import template

datapoints_amount = os.environ.get('DATAPOINTS_AMOUNT')
category = os.environ.get('CATEGORY')
labeled_data = os.environ.get('LABELED_DATA')
template.Run(datapoints_amount, category, labeled_data)