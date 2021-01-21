Feature: Verify Facebook Login credentials

@Reg
Scenario: Verify Facebook Login With Vaild Credentials
Given User should open Facebook on browser
When User should enter vaild username and password
	|dorabu@5424|Dor@1997|
	|dorabu@5424|Dor@1997|
And user should click on Login button

@smoke
Scenario: Verify Facebook Login with invaild credentials
Given user should open Facebook on browser
When user should enter invaild user and password
	|dorabu@5424|Dor@1997|
	|dorabu@5424|Dor@1997|
And user should click on login button
