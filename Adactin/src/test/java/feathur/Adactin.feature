Feature: User in the new website scenario to check login functionality
Scenario: Positive login scenario
Given : User in the homepage of adactin
When : User gives the below credentials to get login
Then : User submits the login button

Scenario: Search Hotel Funtionality
When user Selects The Location From The Dropdown
And user Select The Hotel From The Dropdown
And user Select The RoomType From The Dropdown
And user Select The NumberOfRooms From The Dropdown
And user Enters The ChechInDate In The InputBox
And user Enters The CheckOutDate In The InputBox
And user Selects The AdultsPerRoom From The DropDown
And user .Select The ChildrensPerRoom From The DropDown
Then user Clicks on The Search Button And It Navigate To The SelectHotelPage

Scenario: Select The Functionality
When user Clicks on The RadioButon
Then user Clicks On The Continue Button And It Navigates To The BookHotelPages

Scenario: Select The Functionality
When user Enters The FirstName In The Inputbox
And user Enter The LastName
And user Enter The BillingAddress
And user Enter The CreditCardNumber
And user Enter The CreditCardType
And user Enter The ExpireMoth 
And user Enter The ExpireYear
And user Enter The CvvNumber 
Then user Click On The Booknow Button 

Scenario: Booking Confirmation Functionality
Then user Click On The LogOut Button

