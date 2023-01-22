Feature: Login Functionality
  @Regression
  Scenario Outline:Login Test

    When Navigate to Clever

    And Click on the element in the Form
      | signIn |

    And  User  sending the keys in the Form Content
      | emailLogin | <Email>    |
      | password   | <Password> |



    And Click on the element in the Form
      | signInButton |


    Then Invalid message should be displayed

    Examples:
      | Email               | Password |
      | armanhada@gmail.com | 1209UZx  |

