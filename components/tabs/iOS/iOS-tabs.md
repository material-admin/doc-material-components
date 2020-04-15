<!--docs:
title: "Tabs"
layout: detail
section: components
excerpt: "Tabs organize and allow navigation between groups of content that are related and at the same level of hierarchy."
iconId:
path: /catalog/tabs
-->

# Tabs

[Tabs](https://material.io/components/tabs/) organize content across different screens, data sets, and other interactions.

There are two types of tabs:
1. [Fixed tabs](#fixed-tabs)
1. [Scrollable tabs](#scrollable-tabs)

<br>

1. ![fixed tab example](assets/tabs-fixed-hero.png)
1. ![scrollabe tab example](assets/tabs-scrollable-hero.png)

## Using tabs

Tabs organize and allow navigation between groups of content that are related and at the same level of hierarchy.

### Installing `Tabs`
Before using the `Tabs` API to implement its types you must install `Tabs`. In your source files import the component, and then apply your theme:

1. Install `Tabs`
   * Use CocoaPods to install `Tabs`
     1. Add the following line to your `Podfile`:
       ```java
      pod MaterialComponents/Tabs
       ```
     1. Run the installer:
       ```bash
       pod install
       ```
1. Import `Tabs` and MDC tab theming and initialize `tab` using `alloc`/`init`. Initialize your theme  before applying it to your tab.

  **Note** For more information about themes, go to the [Theming page](https://material.io/develop/ios/components/theming/) for iOS.

    <!--<div class="material-code-render" markdown="1">-->
   **Swift**
   ```swift
   import MaterialComponents.MaterialTabs
   import MaterialComponents.MaterialTabs_Theming
   /*...*/
   // Apply your app's Container Scheme to the Tab controller
   let containerScheme = MDCContainerScheme()

   // Either Primary Theme
   tabViewController.applyPrimaryTheme(withScheme: containerScheme)

   // Or Surface Theme
   tabViewController.applySurfaceTheme(withScheme: containerScheme)
   ```
     
   **Objective-C**
   ```objc
   #import "MaterialButtons.h"
   #import <MaterialComponentsBeta/MaterialButtons+Theming.h>
   /*...*/
   // Apply your app's Container Scheme to the Tab controller
   MDCContainerScheme *containerScheme = [[MDCContainerScheme alloc] init];

   // Either Primary Theme
   [self.tabController applyPrimaryThemeWithScheme:containerScheme];

   // Or Surface Theme
   [self.tabController applySurfaceThemeWithScheme:containerScheme];
   ```
   <!--</div>-->

### Making tabs accessible

**Note to developers: add accessibility information**

## Anatomy and key properties

![Tabs anatomy diagram](assets/tabs-anatomy.png)

1. Container
1. Active icon (Optional if there’s a label)
1. Active text label (Optional if there’s an icon)
1. Active tab indicator
1. Inactive icon (Optional if there’s a label)
1. Inactive text label (Optional if there’s an icon)
1. Tab item

### Containter attributes

| &nbsp; | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

### Active icon attributes (optional)

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

### Active text label attributes (optional)

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** | | | | 
| **Typography** | | | |

### Active tab indicator attributes

### Inactive icon attributes (optional)

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Icon** | | | |
| **Color** | | | |
| **Size** | | | |
| **Gravity** (position relative to text label) | | | |
| **Padding** (space between icon and text label) | | | |

### Inactive text label attributes (optional)

|  | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Text label** | | | |
| **Color** | | | | 
| **Typography** | | | |


### Tab item attributes

| &nbsp; | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |

## Fixed tabs

Fixed tabs display all tabs on one screen, with each tab at a fixed width. The width of each tab is determined by dividing the number of tabs by the screen width. They don’t scroll to reveal more tabs; the visible tab set represents the only tabs available.

### Fixed tab example

`Tabs`
* [Class definition](https://material.io/components/ios/catalog/tabs/api-docs/Classes/MDCTabBar.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Tabs)

The following example shows a row of of fixed tabs.

![Fixed tab example with 3 tabs, each tab has an icon](link to screenshot)


**Note to developers: Create a code example and screenshot with the following**
* A fixed row of three tabs, labeled:
    * "Tab 1"
    * "Tab 2"
    * "Tab 3"
* Tab 1 has a favorites icon
* Tab 2 has a music icon
* Tab 3 has a search icon
* Screenshot only: Tab 2 is shown as selected

## Scrollable tabs

Scrollable tabs are displayed without fixed widths. They are scrollable, such that some tabs will remain off-screen until scrolled.

### Scrollable tab example
`Tabs`
* [Class definition](https://material.io/components/ios/catalog/tabs/api-docs/Classes/MDCTabBar.html)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Tabs)


The following example shows a row of of scrollable tabs.

![Scrollable tab example with 5 tabs with only 3 tabs showing.](link to screenshot)


**Note to developers: Create a code example and screenshot with the following**
* A scrollable row of five tabs, labeled:
    * "Tab 1"
    * "Tab 2"
    * "Tab 3"
    * "Tab 4"
    * "Tab 5"
* The screen shows only 3 tabs
* Screenshot only: Tab 3 is selected.

## Theming a tab

Tabs support [Material Theming](https://material.io/components/app-bars-top/#theming) and can be customized in terms of color, typography and shape.

### Tabs theming example

* Provide a screenshot of the regular app bar that uses the [Shrine](https://material.io/design/material-studies/shrine.html) theme with the following features:

