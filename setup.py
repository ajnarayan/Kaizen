# -*- coding: utf-8 -*-

#bootstrap for the project 

from setuptools import setup, find_packages

with open('README.md') as f:
	readme = f.read()

with open('LICENSE') as f:
	license = f.read()

setup(
	name = 'kaizen',
	version = '1.0.0-SNAPSHOT'
	description = 'Code project in python for problem solving and continous learning'
	long_description = readme,
	author = 'Anjjan Narayan'
	url = 'https://ajnarayan.github.io'
	licesne = license,
	packages = find_packages(exclude=('tests', 'docs')
)
