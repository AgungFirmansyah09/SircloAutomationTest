Feature: Ensure All Endpoint

  @GET-HomePage
  Scenario: GET Pesan Selamat Datang
    Given user send  GET for the view home page
    When user view home page
    Then response status code should be 404

  @POST-alreadyLogin
  Scenario: User Already Login
    Given user send POST to login
    When with password and username
    And  user redirect to 3XX home page
    Then response status code should be 404

  @POST-notYetLoggedin
  Scenario: User not yet Logged in
    Given user send POST to login
    When user redirect to 3XX login page
    Then response status code should be 404

  @POST-IncorrectUsernameOrPassword
  Scenario: User incorrect username and password
    Given user send POST to login
    When user input invalid username or password
    Then response status code should be 404

  @POST-LogoutAndResetCookies
  Scenario: User Logout and reset cookies session_id
    Given user send POST to logout
    When user delete cookies session_id
    Then user redirect to 3XX home page


