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


    Then User Should login successfully

    Examples:
      | Email                  | Password |
      | technoStudy4@gmail.com | 678U2w   |

