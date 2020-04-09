<!--docs:
title: "Material bottom app bar"
layout: detail
section: components
excerpt: "Bottom app bars provide access to a bottom navigation drawer and up to four actions, including the floating action button.
iconId: 
path: /catalog/material-bottom-app-bar/
-->

**Instructions to authors:**
* _Follow the instructions in each section &ndash; see the [accompanying examples](button-examples) for futher guidance._
* _Delete these instructions before submitting your document_


# Bottom app bars

[Bottom app bars](https://material.io/components/app-bars-bottom/) provide access to a bottom navigation drawer and up to four actions, including the floating action button.

![Example bottom app bar with inset floating action button](assets/bottom-app-bar-hero.png)

## Using the bottom app bar

**Note to developers: please add a link to your platform's FAB article below**

Bottom app bars provide access to a bottom navigation drawer and up to four actions, including the [floating action button](link to floating action button here).

Before you can use Material buttons, you need to import the Material Components package for Flutter: 
```
package:flutter/material.dart
```

You need to use [`MaterialApp`](https://api.flutter.dev/flutter/material/MaterialApp-class.html).

For more information on getting started with the Material for Flutter, go to the Flutter [Material library](https://api.flutter.dev/flutter/material/material-library.html) page.


For more guidance using the bottom app bar, go to the [Material design page]((https://material.io/components/app-bars-bottom/)


### Making the bottom app bar accessible

_**List any accessiblity setting or attributes (such as labels), describe how to use them and link to any guidelines on the m.io site (for example, [how to write a good accessibility label for your component](https://material.io/design/usability/accessibility.html#writing))**_



## Bottom app bar example

`AppBar`
* [Class definition](https://api.flutter.dev/flutter/material/AppBar-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/app_bar.dart)
* [Demo](Link to demo app site)

**Note to developers: Please add example source and a screenshot that renders the bottom app bar with the following features:**
* Leading navigation drawer
* Overlapping FAB with '+' icon in the center
* Trailing 'search' and overflow menu control

## Anatomy and key properties

![Bottom app bar anatomy diagram](assets/bottom-app-bar-anatomy.png)


1. Container
1. Navigation drawer control
1. Floating action button (FAB)
1. Action icon
1. Overflow menu control

### Container attributes

| &nbsp; | Property |
| --- | --- |
| **Color** | |
| **Stroke color** |  |
| **Stroke width** | |
| **Shape** |  |
| **Elevation** |  |
| **Ripple color** |  |

### Navigation icon attributes

| &nbsp; | Property |
| --- | --- |
| **Icon** |  |
| **Color** | |
| **Size** |  |
| **Gravity** (position relative to text label) |  |
| **Padding** (space between icon and text label) |  |

### FAB attributes

**Note to developers: Do ypu want to link to the FAB dev doc?**

### Action item atttributes

| &nbsp; | Property |
| --- | --- |
| **Icon** | | 
| **Color** | | 
| **Size** | | 
| **Gravity** (position relative to text label) | | 
| **Padding** (space between icon and text label) | |

### Overflow menu attributes

| &nbsp; | Property |
| --- | --- |
| **Icon** |  |
| **Color** | |
| **Size** | | 
| **Gravity** (position relative to text label) | | 
| **Padding** (space between icon and text label) | | 



## Theming

### Theming example

`AppBar`
* [Class definition](https://api.flutter.dev/flutter/material/AppBar-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/app_bar.dart)


**Note to developers: please add example source and screenshot using the [Shrine](https://material.io/design/material-studies/shrine.html) with the following features:**
* Leading navigation drawer
* Inset FAB with '+' icon in the center
* Trailing 'search', 'favorite', and overflow menu control


