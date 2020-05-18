<!--docs:
title: "Material Snackbars"
layout: detail
section: components
excerpt: "Snackbars provide brief messages about app processes at the bottom of the screen."
iconId: 
path: /catalog/Snackbars/
-->

# Snackbars

[Snackbars](https://material.io/components/snackbars) provide brief messages about app processes at the bottom of the screen.

![Snackbars hero image](assets/snackbars-hero.png)

## Contents

**Note to developers: review the TOC contents to ensure that all rel links apply to your platform dev doc**

* [Using snackbars](#using-snackbars)
* [Making snackbars accessible](#making-snackbars-accessibl)
* [Snackbars example](#snackbar-example)
* [Theming snackbars](#theming-snackbars)

## Using snackbars

Snackbars inform users of a process that an app has performed or will perform. They appear temporarily, towards the bottom of the screen. They shouldn’t interrupt the user experience, and they don’t require user input to disappear.

### Making snackbars accessible

**Note to developers: include platform-specific accessibility information/settings**

## Snackbars anatomy and key properties

The following is an anatomy diagram of a snackbar:

![Snackbar anatomy diagram](assets/snackbars-anatomy.png)

1. Text label
1. Container
1. Action (optional)

### Text label attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `android:text`           | `setText`<br/>`getText`           | 
**Color**      | `android:textColor`      | `setTextColor`<br/>`getTextColor` | 
**Typography**


### Container attributes

&nbsp; | Attribute | Related method(s) | Default value
------ | --------- | ----------------- | -------------
**Color** | `app:background` | N/A | 
**Height** | `app:height` | N/A | 
**Overlay window** | `app:windowActionModeOverlay` (in app theme) | N/A | 

### Action attributes

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | | 


## Snackbars example

`Snackbar`
* [Class definition](https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/snackbar/Snackbar.java)

The following is an example of a snackbar with an action button:

**Note to developers: Provide code source and a screenshot that shows a snackbar with**

* A text label that reads "Text label"
* A container with a background image:
    ![example background image](assets/snackbar-background.jpg)
* A text button with a label "Action"

## Theming example

`Snackbar`
* [Class definition](https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar)
* [GitHub source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/snackbar/Snackbar.java)


The following is an example of a snackbar with an action button that uses the Material.io [Shrine](https://material.io/design/material-studies/shrine.html) color theming::

**Note to developers: Provide code source and a screenshot that shows a snackbar with Material.io [Shrine](https://material.io/design/material-studies/shrine.html) color theming:**

* A text label that reads "Text label"
* A container with a background image:
    ![example background image](assets/snackbar-background.jpg)
* A text button with a label "Action"
