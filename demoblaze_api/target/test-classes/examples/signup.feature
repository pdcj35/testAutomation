Feature: Test the Sign Up endpoint

  Background:
    * url baseUrl
    * def randomString = function(){return java.util.UUID.randomUUID().toString()}
    * def str = callonce randomString
    * def username = 'user-' + str
    * def password = str

  Scenario: Create a new user
    Given path 'signup'
    And request
    """
    {
	      "username": '#(username)',
	      "password": '#(password)'
    }
    """
  When method post
  Then status 200
  And match response == '#string'
  And match response.errorMessage == '#notpresent'

  Scenario: Try to create an user that already exists
    Given path 'signup'
    And request
    """
    {
	      "username": '#(username)',
	      "password": '#(password)'
    }
    """
  When method post
  Then status 200
  And match response.errorMessage == 'This user already exist.'

