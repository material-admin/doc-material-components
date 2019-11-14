<!--docs:
title: "Example Article: iOS Button"
layout: detail
section: components
excerpt: "This is an example of the iOS Button developer article for material.io. It uses the template from [../article-component-template.md]"
iconId:
path: /
api_doc_root:
-->

# Buttons (MDCButtons)

`MDCButtons` is a customizable button component with updated visual styles. This button component has several built-in styles to support different levels of emphasis, as typically any UI will contain a few different buttons to indicate different actions, and also supports [floating buttons](link to floating buttons here).

For more information, go to the material.io [Buttons](http://material.io/components/buttons) page.

## MDCButtons variants

* [Text button](#text-button)
* [Outlined button](#outlined-button)
* [Contained button](#contained-button)


<img src="images/buttons-types-all.png" alt="Support button variants include text button in the upper left, outlined button in the upper right, contained button in the lower left, and toggle button in the lower right">



## Using `MDCButtons`

The `MDCButtons` component provides a complete implementation of Material Design’s button component.

Before using the `MDCButtons` component to implement its variants you must install the component. Then you must import the component into your source files:
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

    **Note** For more information about themes, go to the [Theming page](https:/material.io/develop/ios/components/theming/) for iOS.

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
  To help ensure your buttons are accessible to as many users as possible, please
  be sure to review the following recommendations:
    * Set an appropriate [`accessibilityLabel`](https:/developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel) value if your button does not have a title or only have an icon.

        **Objective-C**
        ```objc
        button.accessibilityLabel = @"Create";
        ```
        **Swift**
        ```swift
        button.accessibilityLabel = "Create"
        ```

### Related APIs

* [Material Design guidelines: Buttons](https://material.io/go/design-buttons)

#### MDCButton classes

* [MDCButton](https://material.io/components/ios/catalog/buttons/api-docs/Classes/MDCButton.html)

----------------------
**Note to developers:** Is there a detailed list of available class properties and a complete example of button implementation? The API docs don't appear to have a complete description of what appear to be properties (e.g. inkColor, inkStyle, etc. aren't defined)
---------------------

#### MDCButton enumerations
* [Enumerations](material.io/components/ios/catalog/buttons/api-docs/Enums.html)



### Text button

Text buttons are typically used for less-pronounced actions, including those located:
 * In dialogs
 * In cards
In cards, text buttons help maintain an emphasis on card content.

<img src="images/ios-text-button.gif" alt="animated gif of an iOS text button">

**Swift**
```swift
button.applyTextTheme(withScheme: <local theme name>)
```

**Objective-C**
```obj-c

MDCButton *button = [[MDCButton alloc] init];
[button applyTextThemeWithScheme:, <local theme name>];
```


#### Text button example using [MDCContainerScheme](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container) theme
-----------
Note to developers:
The current examples appear to be fragmentary. Are there other properties that need to be declared/set, or can a user copy/paste the examples to use in their own code?
------------
**Swift**

```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let containerScheme = MDCContainerScheme()
let button = MDCButton()
button.applyTextTheme(withScheme: containerScheme)
```

**Objective-C**

```ObjC
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponents/MaterialButtons+Theming.h>

MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];
MDCButton *button = [[MDCButton alloc] init];
[button applyTextThemeWithScheme:containerScheme];
```

### Outlined button

Outlined buttons are medium-emphasis buttons. They contain actions that are important, but aren’t the primary action in an app.

<img src="images/ios-outlined.gif" alt="animated gif of an iOS outlined button">

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let containerScheme = MDCContainerScheme()
let button = MDCButton()
button.applyTextTheme(withScheme: containerScheme)
```
**Objective-C**
```objc

#import "MaterialButtons.h"
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];
MDCButton *button = [[MDCButton alloc] init];

[self.button applyTextThemeWithScheme:self.containerScheme];
```

#### Outlined button example using [MDCContainerScheme](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container) theme

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let button = MDCButton()
button.applyTextTheme(withScheme: containerScheme)
```
**Objective-C**
```objc
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCButton *button = [[MDCButton alloc] init];
[self.button applyTextThemeWithScheme:self.containerScheme];
```
### Contained button
Contained buttons are high-emphasis, distinguished by their use of elevation and fill. They contain actions that are primary to your app.

<img src="images/ios-contained.gif" alt="animated gif of an iOS contained button">

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let button = MDCButton()
button.applyContainedTheme(withScheme: containerScheme)
```

**Objective-C**
```objc
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCButton *button = [[MDCButton alloc] init];
[self.button applyContainedThemeWithScheme:self.containerScheme];
```

#### Contained button example using [MDCContainerScheme](https://github.com/material-components/material-components-ios/tree/stable/components/schemes/Container) theme

**Swift**
```swift
import MaterialComponents.MaterialButtons
import MaterialComponents.MaterialButtons_Theming

let button = MDCButton()
button.applyContainedTheme(withScheme: containerScheme)
```
**Objective-C**
```objc
#import <MaterialComponents/MaterialButtons.h>
#import <MaterialComponentsBeta/MaterialButtons+Theming.h>

MDCButton *button = [[MDCButton alloc] init];
[self.button applyContainedThemeWithScheme:self.containerScheme];
```
