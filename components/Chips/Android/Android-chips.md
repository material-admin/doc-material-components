<!--docs:
title: "Material chips"
layout: detail
section: components
excerpt: "Chips are compact elements that represent an input, attribute, or action."
iconId: 
path: /catalog/material-chips/
-->

# Chips

[Chips](https://material.io/components/chips) are compact elements that represent an input, attribute, or action.

![Hero image of an input chip](assets/chips-hero.png)

## Contents

* [Using chips](#using-chips)
* [Making chips accessible](#making-chips-accessible)
* [Input chips](#input-chips)
* [Choice chips](#choice-chips)
* [Filter chips](#filter-chips)
* [Action chips](#action-chips)
* [Theming](#theming)

## Using chips


Chips allow users to enter information, make selections, filter content, or trigger actions. While buttons are expected to appear consistently and with familiar calls to action, chips should appear dynamically as a group of multiple interactive elements.



### Making chips accessible

**Note to developers: List/describe any accessibility settings or attributes associated with chips**

## Anatomy and key properties

The following is an anatomy diagram of a chip:

![Chip anatomy diagram](assets/Chips_anatomy.png)

1. Container
1. Thumbnail (optional)
1. Text
1. Remove icon (optional)

### Container


&nbsp; | Attribute | Related method(s) | Default value
------ | --------- | ----------------- | -------------
**Color** | `app:background` | N/A | 
**Height** | `app:height` | N/A | 
**Overlay window** | `app:windowActionModeOverlay` (in app theme) | N/A | 

### Thumbnail

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

### Text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `android:text`           | `setText`<br/>`getText`           | 
**Color**      | `android:textColor`      | `setTextColor`<br/>`getTextColor` | 
**Typography**


### Remove icon


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 

## Types

There are four different types of chips, including [input](#input-chips), [choice](#choice-chips), [filter](#filter-chips), and [action](#action-chips).

![Examples of the four different chip types](assets/Chips_composite.png)

### Input chips

Input chips (refered to as "entry" chips in Android) represent a complex piece of information in compact form, such as an entity (person, place, or thing) or text. They enable user input and verify that input by converting text into chips.

#### Input chips example

`Chip`
* [Class definition](https://developer.android.com/reference/com/google/android/material/chip/Chip)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/chip/Chip.java)

**Note to developers** Create an input chips example with the following features:

* Generate three chips; each chip has a "remove" icon and is labeled:
    * "Input 1"
    * "Input 2"
    * "Input 3"
* In the chips container, include an incomplete text entry for "Input 4"


### Choice chips

Choice chips allow selection of a single chip from a set of options.

Choice chips clearly delineate and display options in a compact area. They are a good alternative to toggle buttons, radio buttons, and single select menus.

#### Choice chips example

`Chip`
* [Class definition](https://developer.android.com/reference/com/google/android/material/chip/Chip)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/chip/Chip.java)


**Note to developers** Create a choice chips example with the following features:

* Generate four choice chips labeled:
    * "Choice 1"
    * "Choice 2"
    * "Choice 3"
    * "Choice 4"
* Show a screenshot of "Choice 1" as selected

### Filter chips

Filter chips use tags or descriptive words to filter content.

Filter chips clearly delineate and display options in a compact area. They are a good alternative to toggle buttons or checkboxes.


#### Filter chips example

`Chip`
* [Class definition](https://developer.android.com/reference/com/google/android/material/chip/Chip)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/chip/Chip.java)


**Note to developers** Create a filter chips example with the following features:

* Generate six filter chips, each labeled "Filter 1", "Filter 2" ... "Filter 6"
* Show a screenshot of "Filter 1" and "Filter 3" as selected with a check icon

### Action chips

Action chips offer actions related to primary content. They should appear dynamically and contextually in a UI.

An alternative to action chips are buttons, which should appear persistently and consistently.


#### Action chips example

`Chip`
* [Class definition](https://developer.android.com/reference/com/google/android/material/chip/Chip)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/chip/Chip.java)


**Note to developers** Create an action chips example with the following features:

* Generate four actions chips, labeled:
    * "Action 1" with a favorites icon
    * "Action 2" with a trash icon
    * "Action 3" with an alarm icon
    * "Action 4" with a location icon


## Theming

Chips support [Material Theming](https://material.io/components/chips/#theming) and can be customized in terms of color, typography and shape.

### Theming example

`Chip`
* [Class definition](https://developer.android.com/reference/com/google/android/material/chip/Chip)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/chip/Chip.java)


**Note to developers** Create an input chips example with the following features using the [Shrine theme](https://material.io/design/material-studies/shrine.html):

* Generate three chips; each chip has a "remove" icon and is labeled:
    * "Input 1" with an "add\_shopping\_cart" icon
    * "Input 2" with a "card\_giftcard" icon
    * "Input 3" with a "credit\_card" icon
* In the chips container, include an incomplete text entry for "Input 4"


