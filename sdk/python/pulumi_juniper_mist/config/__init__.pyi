# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

apiTimeout: Optional[float]
"""
Timeout in seconds for completing API transactions with the Mist Cloud. Omit for default value of 10 seconds. Value of 0
results in infinite timeout.
"""

apitoken: Optional[str]
"""
For API Token authentication, the Mist API Token.
"""

host: Optional[str]
"""
URL of the Mist Cloud, e.g. `api.mist.com`.
"""

password: Optional[str]
"""
For username/password authentication, the Mist Account password.
"""

proxy: Optional[str]
"""
Requests use the configured proxy to reach the Mist Cloud. The value may be either a complete URL or a
`[username:password@]host[:port]`, in which case the `http` scheme is assumed. The schemes `http`, `https`, and `socks5`
are supported.
"""

username: Optional[str]
"""
For username/password authentication, the Mist Account username.
"""
