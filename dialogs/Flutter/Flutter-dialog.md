<!--docs:
title: "Dialogs"
layout: detail
section: components
excerpt: "Dialogs are modal windows that require interaction."
iconId: 
path: /catalog/dialog/
-->


# Dialogs

Dialogs inform users about a task and can contain critical information, require decisions, or involve multiple tasks.

There are four types of dialogs:

1. [Alert](#alert-dialog)
1. [Simple](#simple-dialog)
1. [Confirmation](#confirmation-dialog)
1. [Full-screen](#full-screen-dialog)

<br>

1. <img src="assets/alert-dialog.png" alt="Alert dialog: discard" width=50%>
1. <img src="assets/simple-dialog.png" alt="Simple dialog: selection" width=50%>
1. <img src="assets/confirmation-dialog.png" alt="Confirmation dialog: selection confirmation" width=50%>
1. <img src="assets/full-screen-dialog.png" alt="Full-screen dialog: event" width=50%>

## Using dialogs

A dialog is a type of modal window that appears in front of app content to provide critical information or ask for a decision. Dialogs disable all app functionality when they appear, and remain on screen until confirmed, dismissed, or a required action has been taken.

Dialogs are purposefully interruptive, so they should be used sparingly.

Before you can use Material dialogss, you need to import the Material Components package for Flutter: `package:flutter/material.dart`.

You need to be using a [`MaterialApp`](https://api.flutter.dev/flutter/material/MaterialApp-class.html).

For more information on getting started with the Material for Flutter, go to the Flutter [Material library](https://api.flutter.dev/flutter/material/material-library.html) page.

### Making dialogs accessible

Flutter's APIs support accessibility setting for large fonts, screen readers, and sufficient contrast. For more information, go to Flutter's [accessibility](https://flutter.dev/docs/development/accessibility-and-localization/accessibility) and [internationalization](https://flutter.dev/docs/development/accessibility-and-localization/internationalization) pages.

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).

## Alert dialog

Alert dialogs interrupt users with urgent information, details, or actions.

### Alert dialog example

`Dialog`
* [Class description](https://api.flutter.dev/flutter/material/Dialog-class.html)
* [API document](https://api.flutter.dev/flutter/material/Dialog/Dialog.html)

### Alert dialog anatomy and key properties

The alert dialog contains the following:

![alert dialog anatomy diagram](assets/dialog-anatomy.png)

1. Container
1. Title (optional)
1. Supporting text
1. Buttons
1. Scrim

**Container attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Color** | |
| **Stroke color** | |
| **Stroke width** | |
| **Shape** | |
| **Elevation** | |
| **Ripple color** | |


**Title attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | | 
| **Typography** | |


**Supporting text attributes**
| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | |
| **Typography** | |


**Buttons attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | | 


**Scrim attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | |


## Simple dialog

Simple dialogs can display items that are immediately actionable when selected. They don’t have text buttons.

As simple dialogs are interruptive, they should be used sparingly. Alternatively, dropdown menus provide options in a non-modal, less disruptive way.

### Simple dialog example

`Dialog`
* [Class description](https://api.flutter.dev/flutter/material/Dialog-class.html)
* [API document](https://api.flutter.dev/flutter/material/Dialog/Dialog.html)

### Simple dialog anatomy and key properties

A simple dialog contains the following:


![simple dialog anatomy diagram](assets/Dialogs_SimpleDIalog_anatomy.png)

1. Container
1. Title 
1. List item
    1. Supporting visual
    1. Primary text
1. Button
1. Scrim



**Container attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Color** | |
| **Stroke color** | |
| **Stroke width** | |
| **Shape** | |
| **Elevation** | |
| **Ripple color** | |


**Title attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | | 
| **Typography** | |


**List item supporting visual attributes**


| &nbsp; | **Properties** |
| --- | --- |
| | |

**List item primary text**
| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | |
| **Typography** | |


**Buttons attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | | 


**Scrim attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | |



## Confirmation dialog

Confirmation dialogs give users the ability to provide final confirmation of a choice before committing to it, so they have a chance to change their minds if necessary.

If the user confirms a choice, it’s carried out. Otherwise, the user can dismiss the dialog. For example, users can listen to multiple ringtones but only make a final selection upon tapping “OK.”

### Confirmation dialog example

`Dialog`
* [Class description](https://api.flutter.dev/flutter/material/Dialog-class.html)
* [API document](https://api.flutter.dev/flutter/material/Dialog/Dialog.html)

### Confirmation dialog anatomy and key properties

A confirmation dialog contains the following:

![confirmation dialog anatomy diagram](assets/Dialogs_Confirmation_anatomy.png)


1. Container
1. Title
1. List item
    1. List control
    1. Primary text
1. Button
1. Scrim

**Container attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Color** | |
| **Stroke color** | |
| **Stroke width** | |
| **Shape** | |
| **Elevation** | |
| **Ripple color** | |


**Title attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | | 
| **Typography** | |


**List item list control attributes**

| &nbsp; | **Properties** |
| --- | --- |
| | | 

**List item primary text attribute**


| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | |
| **Typography** | |


**Buttons attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | | 


**Scrim attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | |



## Full-screen dialog

Full-screen dialogs group a series of tasks, such as creating a calendar entry with the event title, date, location, and time. Because they take up the entire screen, full-screen dialogs are the only dialogs over which other dialogs can appear.dia

### Full-screen dialog example

`Dialog`
* [Class description](https://api.flutter.dev/flutter/material/Dialog-class.html)
* [API document](https://api.flutter.dev/flutter/material/Dialog/Dialog.html)

### Full-screen dialog anatomy and key properties


The full-screen dialog contains the following properties:

![full-screen dialog anatomy](assets/Dialogs_FullScreen_anatomy_no-container.png)

1. Title
1. Icon Button
1. Buttons
1. Scrim

**Container attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Color** | |
| **Stroke color** | |
| **Stroke width** | |
| **Shape** | |
| **Elevation** | |
| **Ripple color** | |


**Title attributes**

| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | | 
| **Typography** | |


**Supporting text attributes**
| &nbsp; | **Properties** |
| --- | --- |
| **Text label** | |
| **Color** | |
| **Typography** | |


**Buttons attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | | 


**Scrim attributes**
| &nbsp; | **Properties** |
| --- | --- |
| | |



## Dialog theming

### Dialog theming example

__**Note to developers** Provide an example with the following features using the [Shrine theme](https://material.io/design/material-studies/shrine.html#about-shrine)__
* Create a simple dialog
* Add a title "Title"
* Add 3 radio buttons with the following options:
  * "option 1"
  * "option 2"
  * "option 3"
* Add two text buttons to the bottom:
  * "Action 1"
  * "Action 2"
* Use the [Cards](https://github.com/mingjane-work/doc-material-components/blob/mingjane-doc-branch/cards-examples/Flutter/assets/shrine_card.png) themed image as the scrim
