Feature: Login to Swaglabs
  @ValidCredentials
  Scenario Outline:Login with valid credentials
    Given User is on home page
    When User enters username as "<userName>"
    And  User enters password as "<passWord>"
    Then He should be able to login successfully
    Then He should be able to see error message "<userName>" and "<passWord>"
    Examples:
    | userName | passWord |
    || secret_sauce |
    | standard_user | null |
    | null | null |
    | standard_user | aryan123 |
    | aryan123 | secret_sauce |
    | aryan7308 | aryan110801 |
    | standard_user | secret_sauce |