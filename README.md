# APIToResetForgottenPassword

This project is a simple spring boot project showing logic to reset forgotten password for any java application.

## Controller

|    Method     |       Path         |    Description                           |
| ------------- |    -------------   |   -------------                          |
|    Post       |   /forgot-password |   Endpoint to send mail to customer      |
|    Post       |   /reset-password  |   Endpoint to replace exisitng password  |

## Service
A random string generator method was used to generate token that would be used to reset password, a mock email sender was also used for the project.
After the link is clicked, several checks are carried out to ensure validity of the token (if token is expired), invalid token, token does not exist, 
invalid email, password and confirm password do not match.
