Feature: Test the LogIn endpoint

  Background:
    * url baseUrl
    * def randomString = function(){return java.util.UUID.randomUUID().toString()}
    * def str = callonce randomString
    * def username = 'user-' + str
    * def password = str
  
  Scenario: Login with correct credentials
    Given path 'signup'
    And request
    """
    {
	    "username": "#(username)",
	    "password": "#(password)"
    }
    """
    When method post
    Then status 200

    Given path 'login'
    And request
    """
    {
	    "username": '#(username)',
	    "password": '#(password)'
    }
    """
    When method post
    Then status 200
    And match response.errorMessage == '#notpresent'


  Scenario: Login with wrong password
    Given path 'login'
    And request
    """
    {
	    "username": '#(username)',
	    "password": '#(password)'+'12'
    }
    """
  When method post
  Then status 200
  And match response.errorMessage contains "Wrong password"

  Scenario: Login with wrong username
    Given path 'login'
    And request
    """
    {
	    "username": '#(username)'+'abc',
	    "password": '#(password)'
    }
    """
  When method post
  Then status 200
  And match response.errorMessage contains "User does not exist"
  