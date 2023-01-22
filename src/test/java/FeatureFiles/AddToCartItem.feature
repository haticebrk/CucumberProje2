Feature: Add to cart Item Functionality
  @Regression
  Scenario Outline:Add To Cart item Test

    When Navigate to Clever

    And Click on the element in the Form
      | signIn |

    And  User  sending the keys in the Form Content
      | emailLogin | <Email>    |
      | password   | <Password> |

    And Click on the element in the Form
      | signInButton |

    Then User Should login successfully

#    And HoverOver on the element in the top menu
#      | women       |
#      | summerDress |

    And HoverOver on the element in the top
      | women       |
      | summerDress |

#    And Action Click on the element in the Top Menu
#      | summerDress |


    And Click on the element in the order
      | blouse          |
      | addToCartButton |


    Then Success message should be displayed


    Examples:
      | Email                  | Password |
      | technoStudy4@gmail.com | 678U2w   |








