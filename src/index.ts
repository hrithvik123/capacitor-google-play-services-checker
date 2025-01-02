import { registerPlugin } from '@capacitor/core';

import type { GooglePlayServicesCheckerPlugin } from './definitions';

const GooglePlayServicesChecker = registerPlugin<GooglePlayServicesCheckerPlugin>('GooglePlayServicesChecker', {
  web: () => import('./web').then((m) => new m.GooglePlayServicesCheckerWeb()),
});

export * from './definitions';
export { GooglePlayServicesChecker };
