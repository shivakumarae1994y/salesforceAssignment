Feature: Funtionality of the Creating the lead Opportunity





Scenario Outline: Create Lead funtionality
When Enter the username as <uname>
And Enter the password as <pwd>
When Click the Login button
When Click the crmsfa link
When Click the Leads link
When click the createlead link
Then Enter the companyname as <companyname>
Then Enter the firstname as <fname>
Then Enter the lastname as <lname>
When click the createlead button
Then Oppotunity created Successfully <EOF>