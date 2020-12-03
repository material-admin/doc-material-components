<!--docs:
title: "Material <component>"
layout: detail
section: components
excerpt: "Navigation drawers provide access to destinations in your app."
iconId: 
path: /catalog/NavigationDrawers/
-->

# Navigation drawer

A [navigation drawers](https://material.io/components/navigation-drawer) provide access to destinations in your app.

![Hero navigation drawer image](assets/NavDrawer-hero.png)

**Contents**

**Note to developers: review the TOC contents to ensure that all rel links apply to your platform dev doc**

* [Using navigation drawers](#using-navigation-drawers)
* [Making navigation drawers accessible](#making-navigation-drawers-accessibl)
* [Installing navigation drawers](#installing-navigation-drawers)
* [Import navigation drawers](#import-navigation-drawers)
* [Standard navigation drawers](#standard-navigation-drawers)
* [Modal navigation drawers](#modal-navigation-drawers)
* [Bottom navigation drawers](#bottom-navigation-drawers)
* [Theming navigation drawers](#theming-navigation-drawers)

## Using a navigation drawer

A navigation drawer provides access to destinations and app functionality, such as switching accounts. It can either be permanently on-screen or controlled by a navigation menu icon.

A navigation drawer is recommended for:

* Apps with five or more top-level destinations
* Apps with two or more levels of navigation hierarchy
* Quick navigation between unrelated destinations

### Making navigation drawers accessible

**Note to developers: include platform-specific accessibility information/settings**

## Anatomy

![Navigation drawer anatomy](assets/NavDrawer-anatomy.png)

1. Container
2. Header (optional)
3. Divider (optional)
4. Active text overlay
5. Active text
6. Inactive text
7. Subtitle
8. Scrim (modal only)

### Container attributes

&nbsp; | Property
------ | --------- 
**Color** |  
**Height** |  
**Overlay window** |

### Header attributes

&nbsp;         | Property
-------------- | ------------------------ 
**Text label** | 
**Color**      | 
**Typography** | 

### Divider attributes


&nbsp;         | Property
-------------- | ------------------------ 
 | 

### Active text overlay attributes

&nbsp;         | Property
-------------- | ------------------------ 
 | 


### Active text attributes

&nbsp;         | Property
-------------- | ------------------------ 
**Text label** | 
**Color**      | 
**Typography** | 

### Inactive text attributes

&nbsp;         | Property
-------------- | ------------------------ 
**Text label** | 
**Color**      | 
**Typography** | 

### Subtitle attributes

&nbsp;         | Property
-------------- | ------------------------ 
**Text label** | 
**Color**      | 
**Typography** | 

### Scrim attributes

&nbsp;         | Property
-------------- | ------------------------ 
 |  

## Types

There are three types of navigation drawer, which include 1. [standard](#standard-navigation-drawers) 2. [modal](#modal-navigation-drawers) 3. [bottom](#bottom-navigation-drawers)

![Standard, modal, and bottom navigation drawer examples](assets/Navigation-drawer_composite.png)

## Standard navigation drawer

[Standard navigation drawers](https://material.io/components/navigation-drawer#standard-drawer) allow interaction with both screen content and the drawer at the same time. They can be used on tablet and desktop, but they aren’t suitable for mobile due to limited screen size.

### Standard navigation drawer example

`Drawer`
* [Class definition](https://api.flutter.dev/flutter/material/Drawer-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/drawer.dart)
* [Demo site](link to dartpad demo)

The following is an example of a standard navigation drawer:

**Note to developers**
Create example code/screenshot with the following features using the Material.io color theming:
* Tile the following images in the background container:
    * assets/nav-drawer-1.jpg
    * assets/nav-drawer-2.jpg
    * assets/nav-drawer-3.jpg
    * assets/nav-drawer-4.jpg
* Include a header title "Header"
* Include a divider below the header
* Include 3 items  below the divider
    * Each item is labeled "Item 1," "Item 2," and "Item 3"
    * Each item has an icon: favorites, garbage, and label
* Include a second divider below the 3 items
    * Include a label "Label" below the second divider
    * Add an item labeled "Item A" with a bookmark icon


## Model navigation drawer

`Drawer`
* [Class definition](https://api.flutter.dev/flutter/material/Drawer-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/drawer.dart)
* [Demo site](link to dartpad demo)


[Modal navigation drawers](https://material.io/components/navigation-drawer#modal-drawer) block interaction with the rest of an app’s content with a scrim. They are elevated above most of the app’s UI and don’t affect the screen’s layout grid.

**Note to developers**
Create example code/screenshot with the following features using the Material.io color theming:
* Tile the following images in the background container:
    * assets/nav-drawer-1.jpg
    * assets/nav-drawer-2.jpg
    * assets/nav-drawer-3.jpg
    * assets/nav-drawer-4.jpg
* Include a header title "Header"
* Include a divider below the header
* Include 3 items  below the divider
    * Each item is labeled "Item 1," "Item 2," and "Item 3"
    * Each item has an icon: favorites, garbage, and label
* Include a second divider below the 3 items
    * Include a label "Label" below the second divider
    * Add an item labeled "Item A" with a bookmark icon
* Include a scrim for the background container


## Bottom navigation drawer

`Drawer`
* [Class definition](https://api.flutter.dev/flutter/material/Drawer-class.html)
* [GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/drawer.dart)
* [Demo site](link to dartpad demo)


[Bottom navigation drawers](https://material.io/components/navigation-drawer#bottom-drawer) are modal drawers that are anchored to the bottom of the screen instead of the left or right edge. They are only used with bottom app bars.

**Note to developers**
Create example code/screenshot with the following features using the Material.io color theming:
* Tile the following images in the background container:
    * assets/nav-drawer-1.jpg
    * assets/nav-drawer-2.jpg
    * assets/nav-drawer-3.jpg
    * assets/nav-drawer-4.jpg
* Include a header title "Header"
* Include a divider below the header
* Include 3 items  below the divider
    * Each item is labeled "Item 1," "Item 2," and "Item 3"
    * Each item has an icon: favorites, garbage, and label
* Include a second divider below the 3 items
    * Include a label "Label" below the second divider
    * Add an item labeled "Item A" with a bookmark icon


## Theming a navigation drawer
`Drawer`
[Class definition](https://api.flutter.dev/flutter/material/Drawer-class.html)
[GitHub source](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/material/drawer.dart)
[Demo site](link to dartpad demo)


**Note to developers**
Create bottom navigation drawer example code/screenshot with the following features using the Material.io [Shrine]((https://material.io/design/material-studies/shrine.html) color theming:
* Tile the following images in the background container:
    * assets/nav-drawer-1.jpg
    * assets/nav-drawer-2.jpg
    * assets/nav-drawer-3.jpg
    * assets/nav-drawer-4.jpg
* Include a header title "Header"
* Include a divider below the header
* Include 3 items  below the divider
    * Each item is labeled "Item 1," "Item 2," and "Item 3"
    * Each item has an icon: favorites, garbage, and label
* Include a second divider below the 3 items
    * Include a label "Label" below the second divider
    * Add an item labeled "Item A" with a bookmark icon

