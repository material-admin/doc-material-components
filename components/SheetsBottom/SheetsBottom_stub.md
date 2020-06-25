<!--docs:
title: "Material sheets: bottom"
layout: detail
section: components
excerpt: "Bottom sheets are surfaces containing supplementary content that are anchored to the bottom of the screen."
iconId: 
path: /catalog/material-sheets-bottom/
-->

# Sheets: bottom

[Bottom sheets](https://material.io/components/sheets-bottom) are surfaces containing supplementary content that are anchored to the bottom of the screen.

![Example bottom sheet: modal bottom sheet](assets/SheetsBottom_hero.png)

## Contents

* [Using bottom sheets](#using-bottom-sheets)
* [Installing bottom sheets](#installing-bottom-sheets)
* [Making bottom sheets accessible](#making-bottom-sheets-accessible)
* [Standard bottom sheet](#standard-bottom-sheet)
* [Modal bottom sheet](#modal-bottom-sheet)
* [Expanding bottom sheet](#expanding-bottom-sheet)
* [Theming bottom sheets](#theming-bottom-sheets)

## Using bottom sheets

Bottom sheets are supplementary surfaces primarily used on mobile. 

### Installing bottom sheets

### Making bottom sheets accessible


## Types

There are three types suitable for different use cases: 1. [Standard bottom sheets](#standard-bottom-sheet) display content that complements the screen’s primary content and remain visible while users interact with the primary content, 2. [Modal bottom sheets](#modal-bottom-sheet) are an alternative to inline menus or simple dialogs on mobile and provide room for additional items, longer descriptions, and iconography, and must be dismissed in order to interact with the underlying content, and 3. [Expanding bottom sheets](#expadning-bottom-sheet) provide a small, collapsed surface that can be expanded by the user to access a key feature or task to offer the persistent access of a standard sheet with the space and focus of a modal sheet.

![Composite image of bottom sheet types](assets/bottom-sheet_types_composite.png)

## Standard bottom sheet

Standard bottom sheets co-exist with the screen’s main UI region and allow for simultaneously viewing and interacting with both regions. They are commonly used to keep a feature or secondary content visible on screen when content in main UI region is frequently scrolled or panned.

### Standard bottom sheet example

**Note to developers: Generate code and screenshots (expanded and collapsed) for a standard bottom sheet showing the following:**
* A phone home screen appropriate for your platform (app icons, background of your choice)
* A standard bottom sheet (collapsed) of a music app that shows:
    * An album thumbnail (use [this](assets/SheetsBottom_standard_image))
    * A track title "Track 1"
    * A "play" icon
* A standard bottom sheet (expanded) of a music app that shows:
    * The album thumbnail, track title, and "play" icon from  the collapsed standard bottom sheet
    * The contents should show tracks "Track 1", "Track 2" ... "Track 5"

### Anatomy and key properties

The following shows the anatomy of a standard bottom sheet:

![Standard bottom sheet anatomy](assets/standard-anatomy.png)

1. Sheet
1. Contents

## Modal bottom sheet

Modal bottom sheets present a set of choices while blocking interaction with the rest of the screen. They are an alternative to inline menus and simple dialogs on mobile, providing additional room for content, iconography, and actions.

Modal bottom sheets are used in mobile apps only.

### Modal bottom sheet example

`\<API name\>`
* [Class definition](link here)
* [GitHub source](link here)


**Note to developers: Generate code and a screenshot (expanded) for a modal bottom sheet showing the following:**
* An image display app that shows an [example image](assets/SheetsBottom_modal_image.jpg) overlayed with a scrim
* A modal bottom sheet with 4 user options:
    * A "share" icon followed by "Share" text
    * A "link" icon followed by "Get link" text
    * An "edit" icon" followed by "Edit name" text
    * A "delete" icon followed by "Delete collection" text

## Anatomy and key properties

The following shows the anatomy of a modal bottom sheet:

![Modal bottom sheet anatomy](assets/modal-anatomy.png)

1. Sheet
2. Contents
3. Scrim

## Expanding bottom sheet

An expanding bottom sheet is a surface anchored to the bottom of the screen that users can expand to access a feature or task. It can be used for:

* **Persistently displaying a cross-app feature**, such as a shopping cart
* **Collecting and acting on user selections** from a set of items, such as photos in a gallery
* **Supporting tasks**, such as chat and comments
* **Indirect navigation between items**, such as videos in a playlist

Expanding bottom sheets are recommended for use on mobile and tablet.

### Expanding bottom sheet example

`\<API name\>`
* [Class definition](link here)
* [GitHub source](link here)


**Note to developers: Generate code and screenshots (collapsed and expanded) for a modal bottom sheet showing the following:**
* Collapsed:
    * A menu app that shows [pasta](assets/SheetsBottom_expanding_1.jpg) and [soup](assets/SheetsBottom_expanding_2.jpg)
    * A collapsed expanding bottom sheet container with a "cart" icon and a label that reads "Cart"
* Expanded:
    * A header
    * A "close action" icon
    * A label "Cart"
    * Content showing a thumbnail of  [pasta](assets/SheetsBottom_expanding_1.jpg), a title "Pasta", and a "delete" icon

### Anatomy and key properties

The following shows the anatomy of an expanding bottom sheet:

![Expanding bottom sheet anatomy](assets/expanding-anatomy.png)

**Collapsed state**
1.Container
2.Icon
3.Label (Optional)

**Expanded state**
4.Header
5.Close action
6.Label
7.Content

## Theming bottom sheets


`\<API name\>`
* [Class definition](link here)
* [GitHub source](link here)


The following shows a modal bottom sheet  with [Shrine theming](https://material.io/design/material-studies/shrine.html):

**Note to developers: Generate code and a screenshot (expanded) for a modal bottom sheet showing the following using [Shrine theming](https://material.io/design/material-studies/shrine.html):**
* An image display app that shows an [example image](assets/SheetsBottom_modal_image.jpg) overlayed with a scrim
* A modal bottom sheet with 4 user options:
    * A "share" icon followed by "Share" text
    * A "link" icon followed by "Get link" text
    * An "edit" icon" followed by "Edit name" text
    * A "delete" icon followed by "Delete collection" text

