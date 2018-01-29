Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: login with correct usename and pass
Given user is already on login page tagging

@SmokeTest 
Scenario: login with incorrect usename and pass
Given user is already on login page incorrect tagging

@RegressionTest
Scenario: create a contact
Given user on new contact page

@RegressionTest
Scenario: create a deal
Given user is on deals page

@SmokeTest
Scenario: create a task 
Given user is on task page

@RegressionTest
Scenario: create a call
Given user is on call page

@SmokeTest @RegressionTest 
Scenario: create a email 
Given user is on email page

