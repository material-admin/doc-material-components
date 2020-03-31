<!--docs:
title: "Lists"
layout: detail
section: components
excerpt: "Lists are continuous, vertical indexes of text or images."
iconId: 
path: /catalog/lists/
-->

# Lists

[Lists](https://material.io/components/lists/) are continuous, vertical indexes of text or images.

There are three list types:
1. [Single-line list](#single-line-list)
1. [Two-line list](#two-line-list)
1. [Three-line list](#three-line-list)

![Composite image of the three list types](assets/lists-types.png)

## Using lists

### Installing list components

1. Install with Cocoapods
    Add the following line to your `Podfile`:

    ```
    pod MaterialComponents/List
    ```
    <!--{: .code-renderer.code-renderer--install }-->
    
    Run the installer:
    
    ```
    pod install
    ```

1. Import the Buttons and initialize them using `alloc`/`init`.

    <!--<div class="material-code-render" markdown="1">-->
    #### Objective-C
    ```objc
    #import "MaterialList.h"
    MDCList *list = [[MDCList alloc] init];
    ```

    #### Swift
    ```swift
    import MaterialComponents.MaterialList
    let list = MDCList()
    ```
    <!--</div>-->



### Making lists accessible

## List anatomy

The following anatomy diagram applies to all three list types:

![List anatomy diagram showing list, row, and list item content](assets/list-content-anatomy.png)

The following anatomy diagrams apply  to the list item content:

![List item content showing supporting visuals, primary text, metadata, and controls in two list components](assets/combined-list-content.png)


A list consists of the following attributes:
1. List
1. Row
1. List item content
    1. Supporting visuals
    1. Primary text
    1. Metadata
    1. Controls



## Single-line list

Single-line list items contain a maximum of one line of text.



### Single-line list example

`MDCBaseCell` API
* [Class description](https://material.io/components/ios/catalog/list/api-docs/Classes/MDCBaseCell.html)
* [GitHub link](https://github.com/material-components/material-components-ios/tree/develop/components/List)

`MDCSelfSizingStereoCell` API
* [Class description](https://material.io/components/ios/catalog/list/api-docs/Classes/MDCSelfSizingStereoCell.html)
* [GitHub link](https://github.com/material-components/material-components-ios/tree/develop/components/List)

**Note to developers**
Provide a single-line list example screenshot and example code with the following:
* List item titles for 3+ list items, starting with "List item 1"
* Each item should have a 'label' icon as its supporting visual
* Each item shoud have metadata numbering from '01' to '0n'


### Single-line list key properties


#### List properties

&nbsp;           | Attribute             | Related method(s)                                                            | Default value
---------------- | --------------------- | ---------------------------------------------------------------------------- | -------------
**Color**        | `backgroundColor`  | `setBackgroundColor:forState:`<br/>`backgroundColorForState`<br/> |
**Stroke color** |  | `setBorderColor:forState:`<br/>`borderColorForState:` | ``
**Stroke width** |  | `setBorderWidth:forState:`<br/>`borderWidthForState:` | ``
**Ripple color** | `inkColor`   | `setInkColor`<br/>`inkColor` | 

#### Row properties

&nbsp;           | Attribute             | Related method(s)                                                            | Default value
---------------- | --------------------- | ---------------------------------------------------------------------------- | -------------
**Color**        | `backgroundColor`  | `setBackgroundColor:forState:`<br/>`backgroundColorForState`<br/> |
**Stroke color** |  | `setBorderColor:forState:`<br/>`borderColorForState:` | ``
**Stroke width** |  | `setBorderWidth:forState:`<br/>`borderWidthForState:` | ``
**Ripple color** | `inkColor`   | `setInkColor`<br/>`inkColor` | 


#### List item content

The following are tables of the list item contents:


##### Supporting visuals

##### Primary text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |

##### Metadata


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |

##### Controls



## Two-line list

Two-line list items contain a maximum of two lines of text.


### Two-line list example


`MDCBaseCell` API
* [Class description](https://material.io/components/ios/catalog/list/api-docs/Classes/MDCBaseCell.html)
* [GitHub link](https://github.com/material-components/material-components-ios/tree/develop/components/List)

`MDCSelfSizingStereoCell` API
* [Class description](https://material.io/components/ios/catalog/list/api-docs/Classes/MDCSelfSizingStereoCell.html)
* [GitHub link](https://github.com/material-components/material-components-ios/tree/develop/components/List)

**Note to developers**
Provide a two-line list example screenshot and example code with the following:
* List item titles for 3+ list items, starting with "List item 1"
* Each list item should have a secondary text line that reads 'Secondary text'
* Each item should have a 'label' icon as its supporting visual
* Each item shoud have a radio control

### Two-line list key properties

The following are tables of the list item contents:

#### List properties

&nbsp;           | Attribute             | Related method(s)                                                            | Default value
---------------- | --------------------- | ---------------------------------------------------------------------------- | -------------
**Color**        | `backgroundColor`  | `setBackgroundColor:forState:`<br/>`backgroundColorForState`<br/> |
**Stroke color** |  | `setBorderColor:forState:`<br/>`borderColorForState:` | ``
**Stroke width** |  | `setBorderWidth:forState:`<br/>`borderWidthForState:` | ``
**Ripple color** | `inkColor`   | `setInkColor`<br/>`inkColor` | 

#### Row properties

&nbsp;           | Attribute             | Related method(s)                                                            | Default value
---------------- | --------------------- | ---------------------------------------------------------------------------- | -------------
**Color**        | `backgroundColor`  | `setBackgroundColor:forState:`<br/>`backgroundColorForState`<br/> |
**Stroke color** |  | `setBorderColor:forState:`<br/>`borderColorForState:` | ``
**Stroke width** |  | `setBorderWidth:forState:`<br/>`borderWidthForState:` | ``
**Ripple color** | `inkColor`   | `setInkColor`<br/>`inkColor` | 

#### List content

##### Supporting visuals

##### Primary text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |


##### Secondary text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |


##### Metadata


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |

##### Controls



### Three-line list

Three-line list items contains a maximum of three lines of text.


### Three-line list example


`MDCBaseCell` API
* [Class description](https://material.io/components/ios/catalog/list/api-docs/Classes/MDCBaseCell.html)
* [GitHub link](https://github.com/material-components/material-components-ios/tree/develop/components/List)

`MDCSelfSizingStereoCell` API
* [Class description](https://material.io/components/ios/catalog/list/api-docs/Classes/MDCSelfSizingStereoCell.html)
* [GitHub link](https://github.com/material-components/material-components-ios/tree/develop/components/List)

**Note to developers**
Provide a three-line list example screenshot and example code with the following:
* List item titles for 3+ list items, starting with "List item 1"
* Each list item should have a secondary text line that reads 'Secondary text'
* Each list item should have a tertiary text line that reads 'Tertiary text'
* Each item should have a 'label' icon as its supporting visual
* Each item shoud have a checkbox



### Three-line list key properties

The following are tables of the list item contents:


#### List properties

&nbsp;           | Attribute             | Related method(s)                                                            | Default value
---------------- | --------------------- | ---------------------------------------------------------------------------- | -------------
**Color**        | `backgroundColor`  | `setBackgroundColor:forState:`<br/>`backgroundColorForState`<br/> |
**Stroke color** |  | `setBorderColor:forState:`<br/>`borderColorForState:` | ``
**Stroke width** |  | `setBorderWidth:forState:`<br/>`borderWidthForState:` | ``
**Ripple color** | `inkColor`   | `setInkColor`<br/>`inkColor` | 

#### Row properites

&nbsp;           | Attribute             | Related method(s)                                                            | Default value
---------------- | --------------------- | ---------------------------------------------------------------------------- | -------------
**Color**        | `backgroundColor`  | `setBackgroundColor:forState:`<br/>`backgroundColorForState`<br/> |
**Stroke color** |  | `setBorderColor:forState:`<br/>`borderColorForState:` | ``
**Stroke width** |  | `setBorderWidth:forState:`<br/>`borderWidthForState:` | ``
**Ripple color** | `inkColor`   | `setInkColor`<br/>`inkColor` | 

#### List content

##### Supporting visuals

##### Primary text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |

##### Secondary text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |

##### Tertiary text

&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |


##### Metadata


&nbsp;         | Attribute                | Related method(s)                 | Default value
-------------- | ------------------------ | --------------------------------- | -------------
**Text label** | `titleLabel` | `setTitle:forState:`<br/>`titleForState:` | 
**Color**      | `titleLabel.textColor` | `setTitleColor:forState:`<br/>`titleColorForState:` |
**Typography** | `titleLabel.font` | `setFont:` and `font` on `titleLabel` |

##### Controls


### Theming lists

Lists support [Material Theming](https://material.io/components/buttons/#theming) and can be
customized in terms of color, typography and shape.

**Note to developers**
Provide a screenshot and code for an example list using Shrine theming with the following properties:

* A three-line list example
* List item titles for 3+ list items, starting with "List item 1"
* Each list item should have a secondary text line that reads 'Secondary text'
* Each list item should have a tertiary text line that reads 'Tertiary text'
* Each item should have a 'label' icon as its supporting visual
* Each item shoud have a checkbox


