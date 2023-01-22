Feature: Register Functionality

  Scenario: Create Register


    When Navigate to Clever

    And Click on the element in the Form
      | signIn |

    And  User  sending the keys in the Form Content
      | email | technoStudy44@gmail.com |


    And Click on the element in the Form
      | createAnAccount |
      | female          |


    And  User  sending the keys in the Form Content
      | firstName | halime |
      | lastName  | yildiz |
      | password  | 678U2w |

    And Click on the element in the Form
      | days     |
      | months   |
      | years    |
      | register |

    Then User should be able to successfully get an account

