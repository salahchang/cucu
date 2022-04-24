Feature: TF login functionality test
#@Rango2
Scenario: 1 User should be able to login with valid credentials 
	Given user is on Techfios login page 
	When User enters password
	When User enters username 
	And User clicks on Signin button 
	Then User should land on Dashb oard page