Feature: To validate the register functionlaity of asos Application

Scenario: To validate the register functionality with invalid credentials

Given The user should be open in asos homepage
When The user has to click join signin option and after fill registration form
And give inavalid password and click outside the textbox 
Then Error message for invalid password should be shown

Scenario: To validate the register functionality with invalid credentialss

Given The user should be open in asos homepages
When The user has to click join signin option and after fill to registration form
And give inavalid pass and click outside the textbox 
Then Error message for invalid pass should be shown


Scenario: To validate the asos url redirection valid credential

Given The user should be open in asos homepagess
When The user has to click join signin options 

Then message for valid dircetion

Scenario: To validate the first name

Given The user should be open in asos homepages1
When The user has to click join signin options1
And give firstname with special character and click outside the textbox
Then Error message for invalid firstname should be shown

Scenario: To validate the last name

Given The user should be open in asos homepages last 
When The user has to click join signin options last
And give lastname with special character and click outside the textbox
Then Error message for invalid Lastname should be shown

Scenario: To validate the last name

Given The user should be open in asos homepages last 
When The user has to click join signin options last
And give lastname with special character and click outside the textbox
Then Error message for invalid Lastname should be shown



Scenario: To validate the login using correct credentials

Given The user should be open in asos homepages success logins 
When The user has to click  signin options last
And give correct emailaddress and password and click signinss
Then redirection should happen to my account page



Scenario: Verify if there is a “forget password” on the login page.

Given The user should be open in asos homepages forget  
When The user has to click  signin options forget
Then check for forget password and validate

Scenario: To Check valid mail and invalid password

Given The user has to open asos homepage

When The user has to click the signin options
And give valid mail and invalid password
Then redirection should happen to my account url