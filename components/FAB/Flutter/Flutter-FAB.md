<!--docs:
title: "Floating action button"
layout: detail
section: components
excerpt: "A floating action button (FAB) represents the primary action of a screen."
iconId: 
path: /catalog/floating-action-button/
-->

# Floating action buttons

A floating action button (FAB) represents the primary action of a screen.

There are three types of FABS:

1. [Regular FABs](#regular-fabs)
2. [Mini FABs](#mini-fabs)
3. [Extended FABs](#extended-fabs)

![Regular FAB example](assets/FAB_types.png)

## Using FABs

A FAB performs the primary, or most common, action on a screen. It appears in front of all screen content, typically as a circular shape with an icon in its center. 

Before you can use Material FABs, you need to import the Material Components package for Flutter: `package:flutter/material.dart`.

You need to be using a [`MaterialApp`](https://api.flutter.dev/flutter/material/MaterialApp-class.html).

For more information on getting started with the Material for Flutter, go to the Flutter [Material library](https://api.flutter.dev/flutter/material/material-library.html) page.


### Making FABs accessible

Flutter's APIs support accessibility setting for large fonts, screen readers, and sufficient contrast. For more information, go to Flutter's [accessibility](https://flutter.dev/docs/development/accessibility-and-localization/accessibility) and [internationalization](https://flutter.dev/docs/development/accessibility-and-localization/internationalization) pages.

For more guidance on writing labels, go to [our page on how to write a good accessibility label](https://material.io/design/usability/accessibility.html#writing).



### Regular FABs


Regular FABs are FABs that are not expanded and are a regular size.

`FloatingActionButton`
* [Class description](https://api.flutter.dev/flutter/material/FloatingActionButton-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/floating_action_button.dart)


**Note to developers: provide sample code and a screenshot of a regular FAB with a '+' icon**

### Anatomy and key properties

![Regular FAB anatomy diagram](assets/FAB_anatomy-long.png)

A regular FAB has a container and an icon.

1. Container
1. Icon

#### Container attributes

&nbsp;         | Property
-------------- | -----------------------
**Color** | 
**Stroke color** | 
**Stroke width** | 
**Shape** | 
**Elevation** | 
**Ripple color** | 

#### Icon attributes

&nbsp;         | Property
-------------- | ------------------------
**Icon** | 
**Color** | 
**Size** | 
**Gravity** | 

## Mini FABs


A mini FAB should be used on smaller screens.

Mini FABs can also be used to create visual continuity with other screen elements.

### Mini FABs example

`FloatingActionButton`
* [Class description](https://api.flutter.dev/flutter/material/FloatingActionButton-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/floating_action_button.dart)

**Note to developers: provide sample code and a screenshot of a mini FAB with a '+' icon**
### Anatomy and key properties


![Mini FAB anatomy diagram](assets/miniFAB_anatomy-long.png)

A mini FAB has a container and an icon.


1. Container
1. Icon

#### Container attributes

&nbsp;         | Property
-------------- | -----------------------
**Color** | 
**Stroke color** | 
**Stroke width** | 
**Shape** | 
**Elevation** | 
**Ripple color** | 

#### Icon attributes

&nbsp;         | Property
-------------- | ------------------------
**Icon** | 
**Color** | 
**Size** | 
**Gravity** | 

## Extended FABs


The extended FAB is wider, and it includes a text label.

### Extended FABs example

`FloatingActionButton`
* [Class description](https://api.flutter.dev/flutter/material/FloatingActionButton-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/floating_action_button.dart)

**Note to developers: provide sample code and a screenshot of an extended FAB with a '+' icon and the word "extended"**

### Anatomy and key properties

![Extended FAB anatomy diagram](assets/extended-FAB_anatomy-long.png)

An extended FAB has a text label, a transparent container and an optional icon.

1. Container
1. Icon
1. Text label


#### Container attributes

&nbsp;         | Property
-------------- | -----------------------
**Color** | 
**Stroke color** | 
**Stroke width** | 
**Shape** | 
**Elevation** | 
**Ripple color** | 

#### Icon attributes

&nbsp;         | Property
-------------- | ------------------------
**Icon** | 
**Color** | 
**Size** | 
**Gravity** | 
#### Text label

&nbsp;         |
-------------- | ------------------------ 
**Text label** | 
**Color** | 
**Typography** | 

## Theming

### FAB theming example

**Note to developers: Provide sample code and a screenshot of a regular FAB, mini FAB, and extended FAB using the [Shrine](https://material.io/design/material-studies/shrine.html) theme**



