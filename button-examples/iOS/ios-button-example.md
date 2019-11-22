# Buttons

[Buttons](https://material.io/components/buttons/) allow users to take actions, and make choices, with a single tap.

There are four variants of buttons:

* [Text button](#text-button)
* [Outlined button](#outlined-button) 
* [Contained button](#contained-button)
* [Toggle button](#toggle-button)

<!-- TODO(b/1234568): Add example image here when it is available. -->

## Using buttons

`MDCButton` is a subclass of UIButton, but with more options for customizing the button's style and
behavior. To initialize an MDCButton, you must alloc/init an instance directly instead of using
`buttonWithType:`, which has been marked unavailable.

* [`MDCButton`](https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html) API docs
* [Source on GitHub](https://github.com/material-components/material-components-ios/blob/develop/components/Buttons/src/MDCButton.h)
* [Material theming on iOS](https://material.io/develop/ios/components/theming/)

### Installation

To use buttons you must

* Use [CocoaPods](https://cocoapods.org/) in your project and add the `MaterialComponents/Buttons` and `MaterialComponents/Buttons+Theming` pods.
* Swift: Import `MaterialComponents.MaterialButtons` and `MaterialComponents.MaterialButtons_Theming`.
* Objective-C: Import `MaterialButtons.h` and `MaterialButtons+Theming.h`.

<details><summary>More details</summary>

Add the `MaterialComponents/Buttons` pod:

 1. Add the following line to your `Podfile`: `pod MaterialComponents/Buttons`
 1. Run the installer: `pod install`.

Import the classes, create and initialize `MDCButton` instances with theming:

**Swift**
 
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming
```

**Objective-C**
 
```objc
#import "MaterialButtons.h"
#import "MaterialButtons+Theming.h"
```
</details>

### Interface Builder

`MDCButton` and its subclasses can be used in Interface Builder, but the button type **must** be set
to "custom" in order for the button's highlight states to work as expected.


## Text button

[Text buttons](https://material.io/components/buttons/#text-button) are typically used for less-pronounced actions, including those located:

* In dialogs
* In cards

In cards, text buttons help maintain an emphasis on card content.

### Key properties

Name | Property | Description
-----|----------|------------
Container color | N/A | Always transparent.
Text color | `colorScheme.primaryColor` | The color to use for this button's text.
Text typeface/style/size | `typographyScheme.button` | The font used for the label.

### Text button example

The following example shows a text button with black text on white background.

<img src="assets/ios-text-button.gif" alt="Text button example in iOS showing the black text 'Text Button' over a white background.">

The default `MDCContainerScheme` instance contains default values for typography, color, and shape. Typically you would customize a single `MDCContainerScheme` instance for your entire app and pass it in to apply consistent defaults across your UI. For more information on different ways to theme your app, see [Theming](https://material.io/develop/ios/components/theming/).	

**Swift**

```swift
let button = MDCButton()
let scheme = MDCContainerScheme()
button.applyTextThemeWithScheme(scheme)
```

**Objective-C**

```ObjC
MDCButton *button = [[MDCButton alloc] init];
MDCContainerScheme *scheme = [[MDCContainerScheme alloc] init];
[button applyTextThemeWithScheme:scheme];
```

## Outlined button

_Repeat for outlined button..._

## Contained button

_Repeat for contained button..._

## Toggle button

_Repeat for toggle button..._