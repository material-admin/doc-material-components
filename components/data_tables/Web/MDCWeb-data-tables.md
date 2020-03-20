<!--docs:
title: "Data tables"
layout: detail
section: components
excerpt: "Data tables display information in a grid-like format of rows and columns."
iconId: 
path: /catalog/data-tables/
api_doc_root: true
-->

# Data tables

[Data tables](https://material.io/components/data-tables/#) display sets of data across rows and columns.

![Data table with 5 rows: 1 header row, 4 rows, one column of checkboxes](assets/data-table-hero.png)

## Using data tables

Data tables display information in a grid-like format of rows and columns. They organize information in a way that’s easy to scan, so that users can look for patterns and insights.

Data tables can contain:

* Interactive components (such as chips, buttons, or menus)
* Non-interactive elements (such as badges)
* Tools to query and manipulate data

Before you can use data tables, you will need to first:

* Install the Material data tables component
* Import JavaScript

### Install the Material data table component

Install the `mdc-data-table` component before including it in your source.

**`mdc-button`**
```bash
npm install @material/data-table
```


### Import JavaScript ripple effect

You can optionally add a JavaScript ripple effect (see [MDC Ripple](https://github.com/material-components/material-components-web/blob/master/packages/mdc-ripple)) to your data tables by importing and then instantiating `MDCRipple` in your `*.js` file. For more information, see the page on importing the [JavaScript component](https://github.com/material-components/material-components-web/blob/master/docs/importing-js.md).

To bundle your `*.js` file, go to the [quickstart page](https://github.com/material-components/material-components-web/blob/master/docs/getting-started.md#quick-start-cdn).

**Note to developers: Add source code to import and instantiate JS ripple effects for data tables if applicable**
```js
import {MDCRipple} from '@material/ripple';
```
### Making data tables accessible

Material Design spec advises that touch targets should be at least 48 x 48 px.
To meet this requirement, add the following to your button:

**Note to developers: Add source code to instantiate accessibility settings for data tables if applicable**
`
```html
```

_**Note**: The outer `mdc-touch-target-wrapper` element is only necessary if you want to avoid potentially overlapping touch targets on adjacent elements (due to collapsing margins)._


## Data tables

* `mdc-data-table`
    * [GitHub source](https://github.com/material-components/material-components-web/tree/master/packages/mdc-data-table)

**Note to developers: provide source code and screenshot for an example data table the following properties**
**
* 5 columns
* 5 rows
* Top row consists of a checkbox followed by "Header A", "Header B" ... "Header D"
* First column consists of checkboxes
* Cells labeled "Cell A1" ... "Cell D4" numbered like the hero image



### Key properties


The following is an anatomy diagram of a data table:

![Data table anatomy diagram](assets/data-table-anatomy.png)

A data table consists of the following properties:

1. Container
1. Column header names
1. Sort button
1. Row checkboxes
1. Rows


## Theming data tables
**Note to developers: _Use the [Shrine theme](https://material.io/design/material-studies/shrine.html) for this example_**
* Provide a screenshot of rendering code that uses "Shrine" theming colors and shapes for the data table example
* Provide source code that renders the screenshot of the theming example

