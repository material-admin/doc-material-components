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

![Example of mobile date pickers](assets/pickers_hero.png)

## Contents

**Note to developers: review the TOC contents to ensure that all rel links apply to your platform dev doc**

* [Using date pickers](#using-date-pickers)
* [Installing date pickers](#installing-date-pickers)
* [Making date pickers accessible](#making-date-pickers-accessible)
* [Mobile date pickers](#mobile-date-pickers)
* [Theming date pickers](#theming-date-pickers)

## Using date pickers

Date pickers let users select a date or range of dates. They should be suitable for the context in which they appear.

Date pickers can be embedded into dialogs on mobile.

## Installing date pickers

### Making date pickers accessible 

**Note to developers: include platform-specific accessibility information/settings**

## Anatomy and key properties

![Pickers anatomy diagram](assets/pickers_anatomy.png)

1. Title
2. Selected date
3. Switch-to-keyboard input icon
4. Year selection menu
5. Month pagination
6. Current date
7. Selected date

#### Title
&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `android:text`           | `setText`<br/>`getText`           | 
**Color**      | `android:textColor`      | `setTextColor`<br/>`getTextColor` | 
**Typography** | | |

#### Selected date

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `android:text`           | `setText`<br/>`getText`           | 
**Color**      | `android:textColor`      | `setTextColor`<br/>`getTextColor` | 
**Typography** | | |

#### Switch-to-keyboard input icon


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

#### Year selection menu


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

#### Month gagination


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

#### Current date


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

#### Selected date


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

## Mobile date pickers

Mobile calendar date pickers can be used to select dates in the near future or past, when it’s useful to see them in a calendar month format. They are displayed in a dialog.

Common use cases include:

Making a restaurant reservation
Scheduling a meeting
They aren’t ideal for selecting dates in the distant past or future that require more navigation, such as entering a birth date or expiration date.

Mobile calendar date pickers allow selection of a single date and year.

### Mobile date pickers example

`MaterialDatePicker`
* [Class definition](https://developer.android.com/reference/com/google/android/material/datepicker/MaterialDatePicker)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/MaterialDatePicker.java)

`CalendarConstraints`
* [Class definition](https://developer.android.com/reference/com/google/android/material/datepicker/CalendarConstraints)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/CalendarConstraints.java)

**Note to developers: provide code and a screenshot an example mobile picker with the following:**
* A title that reads "Select a date"
* A selected date in the format "\<day of the week\>, \<month\>, \<year\>"
* A switch-to-keyboard input icon
* A year selection menu
* Month pagination
* Current date
* Selected date (your choice)

## Theming date pickers

`MaterialDatePicker`
* [Class definition](https://developer.android.com/reference/com/google/android/material/datepicker/MaterialDatePicker)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/MaterialDatePicker.java)

`CalendarConstraints`
* [Class definition](https://developer.android.com/reference/com/google/android/material/datepicker/CalendarConstraints)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/datepicker/CalendarConstraints.java)

The following date pickers example uses the [Material Shrine theme](https://material.io/design/material-studies/shrine.html):
_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_

**Note to developers: provide code and a screenshot an example mobile picker with the following:**
* A title that reads "Select a date"
* A selected date in the format "\<day of the week\>, \<month\>, \<year\>"
* A switch-to-keyboard input icon
* A year selection menu
* Month pagination
* Current date
* Selected date (your choice)


