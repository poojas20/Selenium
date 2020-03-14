@tag
Feature: AppAccess

@tag1
Scenario: Login to the Application
	Given Browser Should be launched and URL should be opened
	When Enter login Credentials UserName "EM01" Password "sentrifugo"
	Then User should be Login and Dashboard Page should be display
	
@tag2
Scenario: Logout Test for Application
	Given Application should be logged in
	When Click on UserName and select Logout option
	Then User should be logged out
	
