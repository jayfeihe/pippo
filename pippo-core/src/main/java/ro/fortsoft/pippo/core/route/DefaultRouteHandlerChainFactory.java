/*
 * Copyright (C) 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.fortsoft.pippo.core.route;

import ro.fortsoft.pippo.core.Application;
import ro.fortsoft.pippo.core.Request;
import ro.fortsoft.pippo.core.Response;

import java.util.List;

/**
 * This factory constructs the default route handler chain.
 *
 * @author James Moger
 *
 */
public class DefaultRouteHandlerChainFactory implements RouteHandlerChainFactory {

    @Override
    public RouteHandlerChain createChain(Request request, Response response, List<RouteMatch> routeMatches) {
        return new DefaultRouteHandlerChain(request, response, routeMatches);
    }

    @Override
    public void init(Application application) {
    }

    @Override
    public void destroy(Application application) {
    }
}