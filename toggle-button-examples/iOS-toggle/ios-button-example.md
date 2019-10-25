<!--docs:
title: "Example article: iOS button"
layout: detail
section: components
excerpt: "This is an example of the iOS Material Button developer article for material.io. It uses the template from [../dev-article-template.md]"
iconId:
path: /
api_doc_root:
@import "@material/button/mdc-button";
-->
# Buttons

Buttons allow users to take actions, and make choices, with a single tap.

The buttons component for the material.io web platform consists of the following implementations are extensions of the [MDCButton](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html) class: 

* [MDCButton](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
  * [Text Button](#text-button)
  * [Outlined Button](#outlined-button) 
  * [Contained Button](#contained-button)
* 
  * [Toggle Icon Button](#toggle-icon)

## Using buttons


### Install `mcd-button`

Before using the `MDCButtons` component to implement its variants you must install `MCDButtons`. In your source files import the component, and then apply your theme:
1. Install `MDCButtons`
   * Use CocoaPods to install `MDCButtons`
     1. Add the following to your `Podfile`:
       ```bash
      pod MaterialComponents/Buttons
       ```
     1. Run the installer:
       ```bash
       pod install
       ```
1. Import `MDCButtons` and MDC buttons theming and initialize `MDCButtons` using `alloc`/`init`. Initialize your theme  before applying it to your button.

  **Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS.

       **Swift**
       ```swift
       import MaterialComponents.MaterialButtons
       import MaterialComponents.MaterialButtons_Theming
       /*...*/
       let <local theme name> = <theme name>
       let button = MDCButton()
       ```
       **Objective-C**
       ```objc
       #import "MaterialButtons.h"
       #import <MaterialComponentsBeta/MaterialButtons+Theming.h>
       /*...*/
       <theme name> *<local theme name> = [[<theme name> alloc] init];
       MDCButton *button = [[MDCButton alloc] init];
     ```
 1. Apply accessibility settings
    To help make your buttons usable to as many users as possible:
    * Set an appropriate [`accessibilityLabel`](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel) value if your button does not have a title or only has an icon.
        **Objective-C**
        ```objc
        button.accessibilityLabel = @"Create";
        ```
        **Swift**
        ```swift
        button.accessibilityLabel = "Create"
        ```


## Text button

Text buttons are typically used for less-pronounced actions, including those located:
* In dialogs
* In cards
In cards, text buttons help maintain an emphasis on card content.

### Text button example

Source Code APIs:c

* [MDCButton](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
* [Themes](https://material.io/develop/ios/components/theming/)


The following example shows a text button with black text on white background.

<img src="assets/ios-text-button.gif" alt="Text button example in iOS showing the black text 'Text Button' over a white background.">


## Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

### Outlined button example

Source Code APIs:

* [MDCButton](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
* [Themes](https://material.io/develop/ios/components/theming/)


<img src="assets/ios-outlined.gif" alt="Outlined button example in iOS">


## Contained button

Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

### Contained button example

Source Code APIs:

* [MDCButton](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html)
* [Themes](https://material.io/develop/ios/components/theming/)


The following examples show a contained button in two states: Disabled and enabled. Color schemes are typically determined by your theme.

<img src="assets/ios-contained.gif" alt="Contained button example in iOS with a black background that flashes gray when pressed">



## Toggle button

Toggle buttons can be used to select from a group of choices.

### Toggle Bar

The toggle bar allows you to select from a group of buttons that can be set to [selective action](https://material.io/components/buttons/#toggle-button) where only one button in a group can be selected at one time.

The Material toggle bar is not supported in iOS. If your application needs a toggle bar, you can use \<link to API here\>.

### Toggle icon


The toggle icon button allows you to select from a group using an icon.

#### Toggle icon example

Source code APIs:

* [MDCCardCollectionCell](https://material.io/develop/ios/components/cards/api-docs/Classes/MDCCardCollectionCell.html)
* [Themes](https://material.io/develop/ios/components/theming/)


The following example shows 4 images arranged in a 2-by-2 array with a favorite icon in the upper-right corner of each image.

It uses the class `ToggleButtonCell`, which extends the `MDCCardCollectionCell` to contain the image, the gesture, and the icon  

<img src="assets/iOS-toggle-icon.png" alt="iOS toggle example showing 4 images in an array with a favorite icon in the upper-right corner of each image.">
