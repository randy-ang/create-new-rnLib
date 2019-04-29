# An example to create a bridge between Java and react-native

in your code:

// import {specificModule}, orWhole from 'libraryName';

import anyName from 'create-new-rnLib';

// I haven't found a way to get the value from return; Instead, I used promise to pass on values

anyName.add(1, 2 /** parameters */).then((resolve) => {
      // in this case, it will return the added value (1 + 2)
    }, 
    (reject) => {
      // no example for reject atm
    }).
  catch((err) => {
    err
  });

