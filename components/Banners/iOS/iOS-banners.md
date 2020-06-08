<!--docs:
title: "Material Banners"
layout: detail
section: components
excerpt: "A banner displays a prominent message and related optional actions."
iconId: 
path: /catalog/material-banners/
-->

# Banners

A [banner](https://material.io/components/banners) displays a prominent message and related optional actions.

![Hero image of a banner showing a transaction error message](assets/banner_hero.png)

## Contents

* [Using banners](#using-banners)
* [Installing banners](#installing-banners)
* [Making banners accessible](#making-banners-accessible)
* [Banners example](#banners-example)
* [Theming banners](#theming-banners)

## Using banners

A banner displays an important, succinct message, and provides actions for users to address (or dismiss the banner). It requires a user action to be dismissed.

Banners should be displayed at the top of the screen, below a top app bar. They’re persistent and nonmodal, allowing the user to either ignore them or interact with them at any time. Only one banner should be shown at a time.

## Installing banners

1. Install with CocoalPods
    Add the following to your Podfile:
    ```
    pod 'MaterialComponents/Banner'
    ```

    
    <!--{: .code-renderer.code-renderer--install }-->
    Run the installer:
    ```
    pod install
    ```

1. Import the `Banner`

    <!--<div class="material-code-render" markdown="1">-->

    #### Objective-C
    ```objc
    #import "MaterialBanner.h"
    ```
    #### Swift
    ```swift
    import MaterialComponents.MaterialBanner
    ```
    <!--</div>-->

### Making banners accessible

## Anatomy and key properties

![Banners anatomy diagram](assets/banners_anatomy.png)

Banners consist of the following:

1. Supporting illustration (optional)
2. Container
3. Text
4. Buttons

### Supporting illustration

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | |



### Container

| &nbsp; | Attribute | Related method(s) | Default value |
| --- | --- | --- | --- |
| **Color** | | | |
| **Stroke color** | | | |
| **Stroke width** | | | |
| **Shape** | | | |
| **Elevation** | | | |
| **Ripple color** | | | |


### Text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |



### Buttons

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
 | | |



## Banners example


`Banner`
* [Class definition](Currently no API documentation)
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Banner)

**Note to developers: Provide source and a screenshot of a banner with the following:**
* A trash icon supporting illustration
* A text message that reads "Error message text"
* Two text buttons:
    * Text button 1 has text that reads: "Action 1"
    * Text button 2 has text that reads: "Action 2"


## Theming banners

* [Class definition](Currently no API documentation))
* [GitHub source](https://github.com/material-components/material-components-ios/tree/develop/components/Banner)

**Note to developers: Provide source and a screenshot of a banner with the following using [Shrine theming](https://material.io/design/material-studies/shrine.html):**
* A trash icon supporting illustration
* A text message that reads "Error message text"
* Two text buttons:
    * Text button 1 has text that reads: "Action 1"
    * Text button 2 has text that reads: "Action 2"


