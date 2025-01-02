import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesCheckerPlugin } from './definitions';

export class GooglePlayServicesCheckerWeb extends WebPlugin implements GooglePlayServicesCheckerPlugin {
  async isGooglePlayServicesAvailable(): Promise<{ available: boolean }> {
    throw this.unimplemented('Not implemented on web.');
  }
}
