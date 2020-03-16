<!--docs:
title: "Bottom navigation"
layout: detail
section: components
excerpt: "Bottom navation bars allow movement between primary distinations in an app"
iconId:
path: /components/bottom-navigation
-->


# Bottom navigation

[Bottom navigation](https://material.io/components/bottom-navigation/#) bars allow movement between primary destinations in an app.

![Example bottom navigation bar with four icons along the bottom: favorites, music, places, and news. The music icon is selected](assets/bottom-nav-generic.png)


## Using bottom navigation

### Install `MaterialBottomNavigation`

Before using the `MaterialBottomNavigation` API to implement its types you must install `MaterialBottomNavigation`. In your source files import the component, and then apply your theme:
1. Install `MaterialBottomNavigation`
   * Use CocoaPods to install `MaterialBottomNavigation`
     1. Add the following line to your `Podfile`:
       ```java
      pod MaterialComponents/BottomNavigation
       ```
     1. Run the installer:
       ```bash
       pod install
       ```
1. Import `MaterialBottomNavigation` and MDC botton navigation theming and initialize `MaterialBottomNavigation` using `alloc`/`init`. Initialize your theme  before applying it to your bottom navigation.

   _**Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS._
    <!--<div class="material-code-render" markdown="1">-->
   **Swift**
   ```swift
   import MaterialComponents.MaterialBottomNavigation
   import MaterialComponents.MaterialBottomNavigation_Theming
   /*...*/
   let <local theme name> = <theme name>
   let bottomNav= MaterialBottomNavigation()
   ```
   **Objective-C**
   ```objc
   #import "MaterialBottomNavigation.h"
   #import <MaterialComponentsBeta/MaterialBottomNavigation+Theming.h>
   /*...*/
   <theme name> *<local theme name> = [[<theme name> alloc] init];
   MaterialBottomNavigation *bottomNav = [[MaterialBottomNavigation alloc] init];
   ```
    <!--</div>-->

    For our examples, we used the following theming values:

    <!--<div class="material-code-render" markdown="1">-->
   **Swift**
   ```swift
   let MyMaterialTheme = MDCContainerScheme()
   ```
   **Objective-C**
   ```objc
   MDCContainerScheme *MyMaterialTheme = []
   ```
    <!--</div>-->




### Making bottom navigation bars accessible
 
To help make your bottom navigation bars usable to as many users as possible, apply the following:

* Set an appropriate [`accessibilityLabel`](https://developer.apple.com/documentation/uikit/uiaccessibilityelement/1619577-accessibilitylabel) value if your bottom navigation bar does not have a title or only has an icon:
  <!--<div class="material-code-render" markdown="1">-->
    **Objective-C**
    ```objc
    bottomNav.accessibilityLabel = @"Create";
    ```
    **Swift**
    ```swift
    bottomNav.accessibilityLabel = "Create"
    ```
  <!--</div>-->

* Set the minimum [visual height to
36 and miniumum visual width to 64](https://material.io/design/components/buttons.html#specs)
  <!--<div class="material-code-render" markdown="1">-->
    **Objective-C**

    ```objc
    bottomNav.minimumSize = CGSizeMake(64, 36);
    ```

    **Swift**

    ```swift
    bottomNav.minimumSize = CGSize(width: 64, height: 48)
    ```
  <!--</div>-->


* **Optional** Set an appropriate `accessibilityHint`

    Apple rarely recommends using the `accessibilityHint` because the label should
    already be clear enough to indicate what will happen. Before you consider
    setting an `-accessibilityHint` consider if you need it or if the rest of your
    UI could be adjusted to make it more contextually clear.

    A well-crafted, thoughtful user interface can remove the need for
   `accessibilityHint` in most situations. Examples for a selection dialog to
    choose one or more days of the week for a repeating calendar event:

    *   (Good) The dialog includes a header above the list of days reading, "Event
    repeats weekly on the following day(s)." The list items do not need
    `accessibilityHint` values.
    *   (Bad) The dialog has no header above the list of days. Each list item
    (representing a day of the week) has the `accessibilityHint` value, "Toggles
    this day."

## Bottom navigation example

Source code API:

_**Note to developers: link to approprite sites as applicable**_ 

* `BottomNavigationBar`
    * [Class description](https://material.io/develop/ios/components/bottomnavigation/api-docs/Classes/MDCBottomNavigationBar.html)
    * [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/BottomNavigation/src)


The following example shows a bottom navigation bar with four icons:

* favorites
* music note
* places
* news

<img src="assets/<platform>-bottom-nav.png" alt="bottom navigation bar with favorites, music note, places, and news icons">

```
<code snippet here>
The source code should render the following:
* bottom navigation bar with purple fill (#6200EE)
* four icons:
    * favorites
    * music note
    * places (not part of material.io icons)
    * news (not part of material.io icons)
* active icon should show up as white
* inactive icons should be show a 60% opacity
```

### Anatomy and key properties

The following is an anatomy diagram for the bottom navigation bar:

![bottom nav anatomy diagram](assets/bottom-nav-anatomy.png)

1. Container
1. Inactive icon
1. Inactive text label
1. Active icon
1. Active text label

**Container attributes**


| &nbsp; | Attribute | Default value |
| --- | --- | --- |
| **Color** | **Getter**: `backgroundColorForState:`<br>**Setter**: `setBackgroundColor:forState`  | `UIColor.Clear` (transparent)<br>`UIColor.Clear` (transparent) |
| **Shape** | `layer.cornerRadius` | 4.0 |
| **Elevation** | `setElevation:forState` |**Normal** 6.0<br>**Highlighted** 12.0<br>**Disabled** 0.0 |
| **Ripple color** | <a href="https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html#/c:objc(cs)MDCButton(py)inkColor"><code>inkColor</code></a> |  White @ 20% opacity | 
| | <a href="https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html#/c:objc(cs)MDCButton(py)inkStyle"><code>inkStyle</code></a> |  `MDCInkStyleBounded` |  
| | <a href="https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html#/c:objc(cs)MDCButton(py)inkMaxRippleRadius"><code>inkMaxRippleRadius</code></a> |  Dynamic |  
| | <a href="https://material.io/develop/ios/components/buttons/api-docs/Classes/MDCButton.html#/c:objc(cs)MDCButton(py)enableRippleBehavior"><code>enableRippleBehavior</code></a> |  `NO` | 



**Inactive text and icon attributes**


| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |
| **Text label** |  | NA |
| **Color** | **Getter**: `titleColorForState:` <br> **Setter**: `setTitleColor:forState:"`  |  `colorScheme.primaryColor`<br>38% `colorScheme.onSurfaceColor` |
| **Typography** | `titleLabel.Font` | `typographyScheme.button`  |
| **Icon color** | **Getter**: `titleColorForState:` <br> **Setter**: `setTitleColor:forState:`  |  `colorScheme.primaryColor`<br>38% `colorScheme.onSurfaceColor` |

**Active text label and icon attributes**


| &nbsp;  | Attribute |  Default value |
| --- | --- | --- |
| **Text label** |  | NA |
| **Color** | **Getter**: `titleColorForState:` <br> **Setter**: `setTitleColor:forState:"`  |  `colorScheme.primaryColor`<br>38% `colorScheme.onSurfaceColor` |
| **Typography** | `titleLabel.Font` | `typographyScheme.button`  |
| **Icon color** | **Getter**: `titleColorForState:` <br> **Setter**: `setTitleColor:forState:`  |  `colorScheme.primaryColor`<br>38% `colorScheme.onSurfaceColor` |



## Theming a bottom nav bar

_Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_

```
<code snippet here>
The source code should render the following:
* bottom navigation bar
* four icons:
    * favorites
    * music note
    * places (not part of material.io icons)
    * news (not part of material.io icons)
```

