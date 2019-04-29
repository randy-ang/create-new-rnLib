
import {NativeModules} from 'react-native';

const {LibraryTrial} = NativeModules;

const passRes = (res) => {
  console.log('res', res);
  return res;
};

export default {
  allfunction: LibraryTrial,
  add: (a, b) => LibraryTrial.add(a, b),
  testing: (a, b) => LibraryTrial.addWithPromise(a, b).then((res) => { 
    console.log('res', res);
    return Promise.resolve(res); 
  }),
};
// const add = (a, b) => {
//   console.log('adding', LibraryTrial.add);
//   return LibraryTrial.add(a, b);
// };

// const testing = () => {
//   const testing = LibraryTrial.testing();
//   console.log('testing', testing);
//   return testing;
// };

// module.exports = {
//   add,
//   testing,
// };

