package de.lukasbreuer.fracton;

import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "create")
public final class ModuleInjectionModule extends AbstractModule {
  @Provides
  @Singleton
  ModuleLoader provideModuleLoader(Injector injector) {
    var directory = System.getProperty("user.dir") + "/modules/";
    return ModuleLoader.create(directory, injector);
  }
}
