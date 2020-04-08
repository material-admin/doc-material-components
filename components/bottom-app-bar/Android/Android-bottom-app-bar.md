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

Before you can use Material s, you need to add a dependency to the Material Components for Android library. For more information, go to the [Getting started](https://github.com/material-components/material-components-android/tree/master/docs/getting-started.md) page.

For more guidance using the bottom app bars, go to the [Material design page]((https://material.io/components/app-bars-bottom/)


### Making the bottom app bar accessible

Android's bottom app bar component APIs provide accessibilty support to describe the navigation navigation drawer, action items, overflow menu, etc. While optional, we highly recommend using accessibility support.

## Bottom app bar example
**Note to developers: double-check that these APIs apply to bottom app bars (copy/pasted from top app bar)**
API and source code:

*   `CoordinatorLayout`
    *   [Class definition](https://developer.android.com/reference/androidx/coordinatorlayout/widget/CoordinatorLayout)
*   `AppBarLayout`
    *   [Class definition](https://developer.android.com/reference/com/google/android/material/appbar/AppBarLayout)
    *   [Class source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/AppBarLayout.java)
*   `MaterialToolbar`
    *   [Class definition](https://developer.android.com/reference/com/google/android/material/appbar/MaterialToolbar)
    *   [Class source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/MaterialToolbar.java)
*   `CollapsingToolbarLayout`
    *   [Class definition](https://developer.android.com/reference/com/google/android/material/appbar/CollapsingToolbarLayout)
    *   [Class source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/CollapsingToolbarLayout.java)

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

&nbsp; | Attribute | Related method(s) | Default value
------ | --------- | ----------------- | -------------
**Color** | `app:background` | N/A | 
**Height** | `app:height` | N/A | 
**Overlay window** | `app:windowActionModeOverlay` (in app theme) | N/A | 

### Navigation icon attributes

&nbsp; | Attribute | Related method(s) | Default value
------ | --------- | ----------------- | -------------
**`MaterialToolbar` icon** | `app:navigationIcon` | `setNavigationIcon`<br>`getNavigationIcon` |
**`MaterialToolbar` icon color** | N/A | N/A | 

### FAB attributes

**Note to developers: Do you want to link to the attribute tables for the FAB dev doc?**

#### Action items attributes

&nbsp; | Attribute | Related method(s) | Default value
------ | --------- | ----------------- | -------------
**`MaterialToolbar` menu** | `app:menu` | `inflateMenu`<br>`getMenu` | 
**`MaterialToolbar` icon color** | N/A | N/A | 

### Overflow menu attributes

&nbsp; | Attribute | Related method(s) | Default value
------ | --------- | ----------------- | -------------
**Icon** | `android:src` and `app:srcCompat` in `actionOverflowButtonStyle` (in app theme) | `setOverflowIcon`<br>`getOverflowIcon` | 
**Overflow item typography** | `textAppearanceSmallPopupMenu` and `textAppearanceLargePopupMenu` in app theme | N/A | 

### Styles

&nbsp; | Style
------ | -----
**Default style** | 




## Theming

### Theming example

**Note to developers: please add example source and screenshot using the [Shrine](https://material.io/design/material-studies/shrine.html) with the following features:**
* Leading navigation drawer
* Inset FAB with '+' icon in the center
* Trailing 'search', 'favorite', and overflow menu control

API and source code:

*   `AppBarLayout`
    *   [Class definition](https://developer.android.com/reference/com/google/android/material/appbar/AppBarLayout)
    *   [Class source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/AppBarLayout.java)
*   `MaterialToolbar`
    *   [Class definition](https://developer.android.com/reference/com/google/android/material/appbar/MaterialToolbar)
    *   [Class source](https://github.com/material-components/material-components-android/tree/master/lib/java/com/google/android/material/appbar/MaterialToolbar.java)

The following example shows a refular top app bar with Material Theming.


