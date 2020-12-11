<!--docs:
title: "Material <component>"
layout: detail
section: components
excerpt: "Time pickers help users select and set a specific time."
iconId: 
path: /catalog/Pickers/
-->

# Time pickers

[Time pickers](https://material.io/components/time-pickers) help users select and set a specific time. 

![Time picker hero image](assets/TimePicker_hero.png)


**Contents**

**Note to developers: review the TOC contents to ensure that all rel links apply to your platform dev doc**

* [Using time pickers](#using-time-pickers)
* [Installing time pickers](#installing-time-pickers)
* [Making time pickers accessible](#making-time-pickers-accessible)
* [Mobile time pickers](#mobile-time-pickers)
* [Mobile time input pickers](#mobile-time-input-pickers)
* [Theming time pickers](#theming-time-pickers)

## Using time pickers

Time pickers allow users to enter a specific time value. They can be used for a wide range of scenarios.  
Common use cases include:
* Setting an alarm
* Scheduling a meeting

Mobile time pickers are displayed in dialogs and can be used to select hours, minutes, and a period of time


### Making time pickers accessible 

**Note to developers: include platform-specific accessibility information/settings**


**Types**


There are two types of time pickers: 1\. [mobile time pickers](#mobile-time-pickers), and 2\. [mobile time input pickers](#mobile-time-input-pickers):

![Composite time picker image](assets/TimePicker_types.png)

### Mobile time pickers

Mobile time pickers can be used to specify time down to hours and minutes in a time period. They are displayed in a dialog.  

* Common use cases include: 
* Setting an alarm
* Scheduling a meeting

Mobile time pickers allow selection of hours and minutes. They aren’t ideal for selecting granular amounts of time, such as milliseconds for a stopwatch application.



#### Mobile time pickers example


`\<API name\>`
* [Class definition](link here)
* [GitHub source](link here)

**Note to developers: Generate code/screenshot of the following**
* Create a mobile time picker that selects 7:15AM

#### Anatomy and key properties

![Mobile time picker anatomy diagram](assets/dial_anatomy.png)

1. Title
1. Interactive display and time input for hour and minutes
1. Clock dial
1. Icon button to switch to time input
1. AM/PM selector

##### Title

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

##### Interactive display

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 


##### Clock dial

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 


##### Input type toggle

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

##### AM/PM selector

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

### Mobile time input pickers

Mobile time input pickers allow users to specify time using the numbers on a keyboard. The mobile time input picker can be accessed from any other mobile time picker interface by tapping the keyboard icon

#### Mobile time input picker example


`\<API name\>`
* [Class definition](link here)
* [GitHub source](link here)

**Note to developers: Generate code/screenshot of the following**
* Create a mobile time input picker that enters "7:15 AM"

#### Anatomy and key properties

![Mobile time minput picker anatomy diagram](assets/input_anatomy.png)

1. Title
1. Hour and minute input field
1. Icon button to switch to dial entry
1. AM/PM selector

##### Title

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

##### Hour and minute input

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

##### Input type toggle

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

##### AM/PM selector

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

## Theming time pickers

`\<API name\>`
* [Class definition](link here)
* [GitHub source](link here)

The following example shows a mobile time picker that uses the [Shrine theme](https://material.io/design/material-studies/shrine.html):

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_

**Note to developers: provide code and a screenshot an example mobile time picker with the following:**

* A mobile time picker that that selects "7:15 AM"

