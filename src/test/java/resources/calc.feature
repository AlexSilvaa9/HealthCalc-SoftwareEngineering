
@tag
Feature: Factorial computation
  As a user I want to compute the factorial of a given number so that I can know the result

  @tag1
  Scenario: Computing the factorial of zero
    Given I have a factorial calculator
    When I compute the factorial of 0
    Then The system returns 1
    
  @tag2
  Scenario Outline: Computing the factorial of a positive small integer
    Given I have a factorial calculator
    When I compute the factorial of <n>
    Then The system returns <value>
   
   	Examples: 
      | n | value |
      | 1 | 1     |
      | 2 | 2     |
      | 3 | 6     |
      | 4 | 24    |
      | 5 | 120   |
      | 6 | 720   |

	@tag3
  Scenario Outline: Computing the factorial of a negative integer
    Given I have a factorial calculator
    When I compute the factorial of a negative number <n>
    Then The system raises an exception
   
   	Examples: 
      | n  |
      | -1 |
      | -2 |
      | -5 |
      