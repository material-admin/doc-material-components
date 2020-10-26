<!--docs:
title: "Material <component>"
layout: detail
section: components
excerpt: "Date pickers let users select a date or range of dates."
iconId: 
path: /catalog/date-pickers/
-->

# Date pickers

[Date pickers](https://material.io/components/date-pickers) let users select a date or range of dates. 

![Mobile date picker for November 2018 with "17" selected.](assets/pickers_hero.png)

## Contents

**Note to developers: review the TOC contents to ensure that all rel links apply to your platform dev doc**

* [Using date pickers](#using-pickers)
* [Installing date pickers](#installing-pickers)
* [Making date pickers accessible](#making-pickers-accessible)
* [Date pickers](#date-pickers)
* [Date range pickers](#date-range-pickers)
* [Theming date pickers](#theming-pickers)

## Using date pickers

Date pickers let users select a date or range of dates. They should be suitable for the context in which they appear.

Date pickers can be embedded into:

* Dialogs on mobile
* Text field dropdowns on desktop

## Installing date pickers

### Making date pickers accessible 

**Note to developers: include platform-specific accessibility information/settings**

## Anatomy and key properties

The following diagram shows the elements of a date picker:

![Date pickers anatomy diagram](assets/pickers_anatomy.png)

1. Title
2. Selected date
3. Switch-to-keyboard input icon
4. Year selection menu
5. Month pagination
6. Current date
7. Selected date

### Title

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 


### Selected date

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 

### Switch-to-keyboard input icon

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 

### Year selection menu

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 

### Month pagination

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 

### Current date

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 

### Selected date

&nbsp;                                  | Attribute                
--------------------------------------- | ------------------------
 | 

## Date pickers

Mobile date pickers can be used to select dates in the near future or past, when it’s useful to see them in a calendar month format. They are displayed in a dialog.

Common use cases include:

Making a restaurant reservation
Scheduling a meeting
They aren’t ideal for selecting dates in the distant past or future that require more navigation, such as entering a birth date or expiration date.

Mobile date pickers allow selection of a single date and year.

### Date pickers example

`DateTimeRange`
* [Class definition](https://api.flutter.dev/flutter/material/DateTimeRange-class.html)
* _**Note to developers: confirm that this is the right directory for the `DateTimeRange` class**_[GitHub souce](https://github.com/flutter/flutter/tree/master/packages/flutter/lib/src/material/pickers)

**Note to developers: provide code and a screenshot an example mobile date picker with the following:**
* A title that reads "Select a date"
* A selected date in the format "\<day of the week\>, \<month\>, \<year\>"
* A switch-to-keyboard input icon
* A year selection menu
* Month pagination
* Current date
* Selected date (your choice)

## Date range pickers

Mobile date range pickers allow selection of a range of dates. They cover the entire screen.

Common use cases include:

* Booking a flight
* Reserving a hotel

### Date range picker example

`DateTimeRange`
* [Class definition](https://api.flutter.dev/flutter/material/DateTimeRange-class.html)
* _**Note to developers: confirm that this is the right directory for the `DateTimeRange` class**_[GitHub souce](https://github.com/flutter/flutter/tree/master/packages/flutter/lib/src/material/pickers)


**Note to developers: provide code and a screenshot an example mobile date range picker with the following:**
* A title that reads "Select a date range"
* A current date
* A month of your choice
* Selected date range (your choice)



## Theming date pickers

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_

**Note to developers: provide code and a screenshot an example mobile date picker with the following:**
* A title that reads "Select a date"
* A selected date in the format "\<day of the week\>, \<month\>, \<year\>"
* A switch-to-keyboard input icon
* A year selection menu
* Month pagination
* Current date
* Selected date (your choice)


