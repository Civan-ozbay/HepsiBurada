Feature: Like to review
  @wip
  Scenario: Click to yes button
    Given User open to "hepsiburada.com"
    Then User searching "iphone"
    And User choose a first product
    And User navigates to Değerlendirmeler tab
    Then User click to first like button
    And Verify Teşekkür Ederiz. text message
