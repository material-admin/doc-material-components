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

**Contents**

**Note to developers: review the TOC contents to ensure that all rel links apply to your platform dev doc**

* [Using snackbars](#using-snackbars)
* [Installing snackbars](#installing-snackbars)
* [Making snackbars accessible](#making-snackbars-accessible)
* [Snackbars example](#snackbar-example)
* [Theming snackbars](#theming-snackbars)

## Using snackbars

Snackbars inform users of a process that an app has performed or will perform. They appear temporarily, towards the bottom of the screen. They shouldn’t interrupt the user experience, and they don’t require user input to disappear.

### Installing snackbars

In order to install Snackbars with [Cocoapods](https://guides.cocoapods.org/using/getting-started.html) first add the component to your `Podfile`:

```bash
pod 'MaterialComponents/Snackbar'
```

Then run the installer:

```bash
pod install
```

Then import the Snackbar target:


<!--<div class="material-code-render" markdown="1">-->

#### Swift
```swift
import MaterialComponents.MaterialSnackbar
```

#### Objective-C
```objc
#import "MaterialSnackbar.h"
```
<!--</div>-->

### Making snackbars accessible

**Note to developers: include platform-specific accessibility information/settings**

## Snackbars anatomy and key properties

The following is an anatomy diagram of a snackbar:

![Snackbar anatomy diagram](assets/snackbars-anatomy.png)

1. Text label
1. Container
1. Action (optional)

### Text label attributes

&nbsp;         | **Attribute**            | **Related methods**              | **Default value**
-------------- | ------------------------ | -------------------------------- | -----------------
**Text label** | `title`                  | `-setTitle:`<br/>`-title`        |
**Text color** | `titleColor`             | `-setTitleColor:`<br/>`-titleColor` |
**Typography** | `titleFont`              | `-setTitleFont:`<br/> `-titleFont` |



### Container attributes

&nbsp;                | **Attribute**             | **Related methods**                                    | **Default value**
----------------------| --------------------------| ------------------------------------------------------ | -----------------
**Color**             | `view.backgroundColor`    | `-setBackgroundColor:` <br/> `-backgroundColor`   | 
**Shape**             | `cornerRadius`            | `-setCornerRadius:` <br/> `-cornerRadius`              |

### Action attributes

&nbsp;                | **Attribute**             | **Related methods**                                    | **Default value**
----------------------| --------------------------| ------------------------------------------------------ | -----------------

## Snackbars example

The following is an example of a snackbar with an action button:

**Note to developers: Provide code source and a screenshot that shows a snackbar with**

* A text label that reads "Text label"
* A container with a background image:
    ![example background image](assets/snackbar-background.jpg)
* A text button with a label "Action"

## Theming example

The following is an example of a snackbar with an action button that uses the Material.io [Shrine](https://material.io/design/material-studies/shrine.html) color theming::

**Note to developers: Provide code source and a screenshot that shows a snackbar with Material.io [Shrine](https://material.io/design/material-studies/shrine.html) color theming:**

* A text label that reads "Text label"
* A container with a background image:
    ![example background image](assets/snackbar-background.jpg)
* A text button with a label "Action"
