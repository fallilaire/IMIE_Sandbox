import { SampleAngularPage } from './app.po';

describe('sample-angular App', function() {
  let page: SampleAngularPage;

  beforeEach(() => {
    page = new SampleAngularPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
