@regression
Feature: Job Search Test

  Scenario Outline: verify Job Search Result Using Different Data Set
    Given I am on Home Page
    When i accept cookies
    And enter job title "<jobTitle>"
    And enter Location "<location>"
    And select distance "<distance>"
    And click on moreSearchOptionsLink
    And enter salaryMin "<salaryMin>"
    And enter salaryMax "<salaryMax>"
    And select salaryType "<salaryType>"
    And select jobType "<jobType>"
    And click on Find Jobs button
    Then verify the result

    Examples:
      | jobTitle           | location                           | distance  | salaryMin | salaryMax | salaryType | jobType   |
      | Tester             | Harrow on the Hill, Greater London | 5 miles   | 30000     | 50000     | Per annum  | Permanent |
#      | Software           | Pitsea, Essex                      | 15 miles  | 35000     | 55000     | Per annum  | Permanent |
#      | Manager            | Ilford, Greater London             | 2 miles   | 35000     | 55000     | Per annum  | Permanent |
#      | Bookkeeper         | Bishops Hatfield, Hertfordshire    | 10 miles  | 35000     | 55000     | Per annum  | Permanent |
#      | Sales Manager      | Lincoln, Lincolnshire              | 15 miles  | 35000     | 55000     | Per annum  | Permanent |
#      | Software Developer | Kingswood, South Gloucestershire   | 100 miles | 35000     | 55000     | Per annum  | Permanent |

