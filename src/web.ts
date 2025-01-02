import { WebPlugin } from '@capacitor/core';

import type { GooglePlayServicesCheckerPlugin } from './definitions';

export class GooglePlayServicesCheckerWeb extends WebPlugin implements GooglePlayServicesCheckerPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
